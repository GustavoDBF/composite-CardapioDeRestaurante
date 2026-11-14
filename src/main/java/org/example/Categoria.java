package org.example;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends ItemMenu {

    private List<ItemMenu> itens;

    public Categoria(String nome) {
        super(nome);
        this.itens = new ArrayList<ItemMenu>();
    }

    public void addItem(ItemMenu item) {
        this.itens.add(item);
    }

    @Override
    public String getCardapio() {
        StringBuilder saida = new StringBuilder();
        saida.append("Categoria: ").append(this.getNome()).append("\n");
        for (ItemMenu item : itens) {
            saida.append(item.getCardapio());
        }
        return saida.toString();
    }
}