package com.example.jogos;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView imagem=findViewById(R.id.Fotocap);
        TextView  texto=findViewById(R.id.capital);
        Bundle data = getIntent().getExtras();

        imagem.setImageResource(data.getInt("imagem"));
        texto.setText(data.getString("nome"));


    }
}
