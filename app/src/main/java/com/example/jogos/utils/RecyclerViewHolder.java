package com.example.jogos.utils;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jogos.R;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    TextView nome;
    ImageView imagem;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        nome = itemView.findViewById(R.id.Textof1);
        imagem = itemView.findViewById(R.id.Foto1);


    }
}
