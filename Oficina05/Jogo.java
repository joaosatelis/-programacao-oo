import java.util.Random;

public class Jogo {
    private Jogador jogador;
    private int numeroSecreto;

    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        Random rand = new Random();
        this.numeroSecreto = rand.nextInt(100) + 1;
    }

    public String jogar(int tentativa) {
        this.jogador.incrementarTentativas();
        if (tentativa > this.numeroSecreto) {
            return "maior";
        } else if (tentativa < this.numeroSecreto) {
            return "menor";
        } else {
            int pontuacao = 100 - this.jogador.getTentativas() * 10;
            this.jogador.atualizarPontuacao(Math.max(0, pontuacao)); // Garante que a pontuação não seja negativa
            return "acertou";
        }
    }

    public Jogador getJogador() {
        return jogador;
    }
}