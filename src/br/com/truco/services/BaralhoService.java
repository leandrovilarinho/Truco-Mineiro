package br.com.truco.services;

import br.com.truco.models.Baralho;
import br.com.truco.models.Carta;

public class BaralhoService {
    private Baralho baralho;

    public BaralhoService() {
        this.baralho = new Baralho();
    }

    public void embaralhar() {
        baralho.embaralhar();
    }

    public Carta distribuirCarta() {
        return baralho.distribuirCarta();
    }
}