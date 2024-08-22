package br.com.truco.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        criarBaralho();
        embaralhar();
    }

    private void criarBaralho() {
        String[] naipes = {"Ouros", "Espadas", "Copas", "Paus"};
        int[] valores = {4, 5, 6, 7, 10, 11, 12, 1, 2, 3};  // Valores de Truco

        for (String naipe : naipes) {
            for (int valor : valores) {
                cartas.add(new Carta(naipe, valor));
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta distribuirCarta() {
        return cartas.remove(0);
    }
}