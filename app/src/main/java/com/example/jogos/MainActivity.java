package com.example.jogos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.jogos.models.jogos;
import com.example.jogos.utils.RecyclerViewAdapter;
import com.example.jogos.utils.RecyclerViewOnItemTouchListener;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private List<jogos> jogo = new ArrayList<jogos>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       RecyclerView recyclerView = findViewById(R.id.recycler_view);

        this.insertData();

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(new RecyclerViewAdapter(jogo));

        recyclerView.addOnItemTouchListener(
                new RecyclerViewOnItemTouchListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerViewOnItemTouchListener.OnItemClickListener() {

                            @Override
                            public void onItemClick(View view, int position) {
                                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

                                intent.putExtra("nome", jogo.get(position).getName());
                                intent.putExtra("imagem", jogo.get(position).getImagem());


                                startActivity(intent);
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {

                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        }
                )
        );
    }



    public void insertData() {
        jogo.add(new jogos("League of Legends", R.drawable.aaaaaaa));
        jogo.add(new jogos("Minecraft" , R.drawable.bb));
        jogo.add(new jogos("Terraria", R.drawable.cc));
        jogo.add(new jogos("CS GO", R.drawable.dd));
        jogo.add(new jogos("Grand Chase", R.drawable.ee));


    }
}