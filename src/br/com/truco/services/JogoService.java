package br.com.truco.services;

import br.com.truco.models.Jogador;
import br.com.truco.models.MaoDeJogo;

public class JogoService {

    public Jogador determinarVencedorDaMao(MaoDeJogo maoDeJogo) {
        return maoDeJogo.vencedor();
    }

    public void iniciarNovaMao(Jogador jogador1, Jogador jogador2) {
        MaoDeJogo maoDeJogo = new MaoDeJogo(jogador1, jogador2);
        Jogador vencedor = determinarVencedorDaMao(maoDeJogo);
        System.out.println("O vencedor da mão é: " + vencedor.getNome());
    }
}