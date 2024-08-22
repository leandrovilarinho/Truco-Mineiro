package br.com.truco.models;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Carta> mao;

    public Jogador(String nome) {
        this.nome = nome;
        this.mao = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Carta> getMao() {
        return mao;
    }

    public void adicionarCartaNaMao(Carta carta) {
        this.mao.add(carta);
    }

    public void removerCartaDaMao(Carta carta) {
        this.mao.remove(carta);
    }
}