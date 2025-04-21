import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Placar placarGeral = new Placar();

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");

        System.out.print("Digite o seu nome: ");
        String nomeJogador = scanner.nextLine();
        Jogador jogadorAtual = new Jogador(nomeJogador);
        Jogo jogoAtual = new Jogo(jogadorAtual);

        String resultado;
        do {
            System.out.print("Digite sua tentativa: ");
            int tentativa = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            resultado = jogoAtual.jogar(tentativa);
            System.out.println("Resultado: " + resultado);
            System.out.println("Tentativas: " + jogoAtual.getJogador().getTentativas());

        } while (!resultado.equals("acertou"));

        System.out.println("\nParabéns, " + jogoAtual.getJogador().getNome() + "! Você acertou em " + jogoAtual.getJogador().getTentativas() + " tentativas.");
        System.out.println("Pontuação final: " + jogoAtual.getJogador().getPontuacao());

        // Adiciona o jogador ao placar e exibe o ranking
        placarGeral.adicionarJogador(jogoAtual.getJogador());
        placarGeral.mostrarRanking();

        scanner.close();
    }
}