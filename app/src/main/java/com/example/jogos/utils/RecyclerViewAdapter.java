package com.example.jogos.utils;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jogos.R;
import com.example.jogos.models.jogos;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {

    private List<com.example.jogos.models.jogos> jogos;

    public RecyclerViewAdapter(List<jogos> list) {
        this.jogos = list;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View listItem = LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.recyclerview_adapter_item, parent, false);

        return new RecyclerViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        jogos d = jogos.get(position);

        holder.nome.setText(d.getName());
        holder.imagem.setImageResource(d.getImagem());
    }

    @Override
    public int getItemCount() {
        return jogos.size();
    }
}
