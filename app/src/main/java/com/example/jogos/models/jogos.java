package com.example.jogos.models;

public class jogos {
    private String name;
    private int imagem;

    public jogos() {
    }

    public jogos(String name, int imagem) {
        this.name = name;
        this.imagem = imagem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
