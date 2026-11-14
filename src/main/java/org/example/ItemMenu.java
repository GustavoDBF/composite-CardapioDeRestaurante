package org.example;

public abstract class ItemMenu {

    private String nome;

    public ItemMenu(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract String getCardapio();
}