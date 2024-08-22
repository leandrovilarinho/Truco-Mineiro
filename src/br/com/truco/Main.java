package br.com.truco;

import br.com.truco.exceptions.TrucoException;
import br.com.truco.models.Jogador;
import br.com.truco.services.BaralhoService;
import br.com.truco.services.JogoService;
import br.com.truco.services.JogadorService;

public class Main {
    public static void main(String[] args) {
        try {
            Jogador jogador1 = new Jogador("Alice");
            Jogador jogador2 = new Jogador("Bob");

            // Aqui a exceção pode ser lançada
            Truco truco = new Truco(jogador1, jogador2);
            truco.iniciarJogo();
        } catch (TrucoException e) {
            System.out.println("Erro ao iniciar o jogo: " + e.getMessage());
        }
    }
}