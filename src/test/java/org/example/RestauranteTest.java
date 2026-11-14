package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RestauranteTest {

    @Test
    void deveRetornarCardapioDoRestaurante() {
        Categoria categoria1 = new Categoria("Bebidas");
        Prato prato11 = new Prato("Suco de Laranja", 8.50);
        categoria1.addItem(prato11);

        Categoria categoria2 = new Categoria("Pratos Principais");
        Prato prato21 = new Prato("Lasanha à Bolonhesa", 35.00);
        Prato prato22 = new Prato("Bife a Cavalo", 42.00);
        categoria2.addItem(prato21);
        categoria2.addItem(prato22);

        Categoria categoria3 = new Categoria("Sobremesas");
        Prato prato31 = new Prato("Pudim", 12.00);
        categoria3.addItem(prato31);

        Categoria menuPrincipal = new Categoria("Menu Completo");
        menuPrincipal.addItem(categoria1);
        menuPrincipal.addItem(categoria2);
        menuPrincipal.addItem(categoria3);

        Restaurante restaurante = new Restaurante();
        restaurante.setMenuPrincipal(menuPrincipal);

        assertEquals("Categoria: Menu Completo\n" +
                "Categoria: Bebidas\n" +
                "Prato: Suco de Laranja - preço: R$ 8,50\n" +
                "Categoria: Pratos Principais\n" +
                "Prato: Lasanha à Bolonhesa - preço: R$ 35,00\n" +
                "Prato: Bife a Cavalo - preço: R$ 42,00\n" +
                "Categoria: Sobremesas\n" +
                "Prato: Pudim - preço: R$ 12,00\n", restaurante.getMenuPrincipal());
    }

    @Test
    void deveRetornarExcecaoRestauranteSemMenu() {
        try {
            Restaurante restaurante = new Restaurante();
            restaurante.getMenuPrincipal();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Restaurante sem menu", e.getMessage());
        }
    }
}