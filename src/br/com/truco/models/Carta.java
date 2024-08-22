package br.com.truco.models;

public class Carta {
    private String naipe;
    private int valor;

    public Carta(String naipe, int valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public String getNaipe() {
        return naipe;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return valor + " de " + naipe;
    }
}