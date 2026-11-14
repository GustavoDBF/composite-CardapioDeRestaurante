package org.example;

public class Prato extends ItemMenu {

    private double preco;

    public Prato(String nome, double preco) {
        super(nome);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String getCardapio() {
        return "Prato: " + this.getNome() + " - preço: R$ " + this.preco + "\n";
    }
}