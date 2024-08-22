package br.com.truco.models;

import br.com.truco.exceptions.JogadorInvalidoException;

public class Truco {
    private Jogador jogador1;
    private Jogador jogador2;

    public Truco(Jogador jogador1, Jogador jogador2) throws TrucoException {
        if (jogador1 == null || jogador2 == null) {
            throw new TrucoException("Jogadores inválidos!");
        }
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public void iniciarJogo() {
        // Lógica do jogo
    }
}