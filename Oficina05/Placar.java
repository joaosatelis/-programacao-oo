import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Placar {
    private ArrayList<Jogador> ranking;

    public Placar() {
        this.ranking = new ArrayList<>();
    }

    public void adicionarJogador(Jogador j) {
        this.ranking.add(j);
        // Ordena o ranking por pontuação decrescente após adicionar um jogador
        Collections.sort(this.ranking, Comparator.comparingInt(Jogador::getPontuacao).reversed());
    }

    public void mostrarRanking() {
        System.out.println("\n--- Ranking ---");
        if (ranking.isEmpty()) {
            System.out.println("O placar está vazio.");
        } else {
            for (int i = 0; i < ranking.size(); i++) {
                System.out.println((i + 1) + ". " + ranking.get(i).getNome() + ": " + ranking.get(i).getPontuacao() + " pontos");
            }
        }
        System.out.println("---------------");
    }
}