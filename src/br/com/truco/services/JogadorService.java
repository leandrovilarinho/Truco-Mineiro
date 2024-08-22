package br.com.truco.services;

import br.com.truco.models.Carta;
import br.com.truco.models.Jogador;

public class JogadorService {

    public void adicionarCartaNaMao(Jogador jogador, Carta carta) {
        jogador.adicionarCartaNaMao(carta);
    }

    public void removerCartaDaMao(Jogador jogador, Carta carta) {
        jogador.removerCartaDaMao(carta);
    }

    public void exibirMao(Jogador jogador) {
        System.out.println(jogador.getNome() + " tem as cartas: ");
        for (Carta carta : jogador.getMao()) {
            System.out.println(carta);
        }
    }
}