package br.com.truco.models;

public class MaoDeJogo {
    private Jogador jogador1;
    private Jogador jogador2;

    public MaoDeJogo(Jogador jogador1, Jogador jogador2) {
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
    }

    public Jogador vencedor() {
        // Simplificando a lógica para escolher o vencedor baseado na primeira carta
        Carta carta1 = jogador1.getMao().get(0);
        Carta carta2 = jogador2.getMao().get(0);

        if (carta1.getValor() > carta2.getValor()) {
            return jogador1;
        } else {
            return jogador2;
        }
    }
}