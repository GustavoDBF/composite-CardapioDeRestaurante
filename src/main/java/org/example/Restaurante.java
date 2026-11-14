package org.example;

public class Restaurante {

    private ItemMenu menuPrincipal;

    public void setMenuPrincipal(ItemMenu menuPrincipal) {
        this.menuPrincipal = menuPrincipal;
    }

    public String getMenuPrincipal() {
        if (this.menuPrincipal == null) {
            throw new NullPointerException("Restaurante sem menu");
        }
        return this.menuPrincipal.getCardapio();
    }
}