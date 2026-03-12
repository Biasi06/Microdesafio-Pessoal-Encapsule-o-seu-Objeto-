package main;

import br.com.Mochila.model.Mochila;

public class TesteMochila {
    public static void main(String[] args) {
        Mochila minhaMochila = new Mochila("Preta", 10.0);

        minhaMochila.alternarZiper();
        minhaMochila.adicionarItem(5.0);

        minhaMochila.adicionarItem(6.0);
    }
}