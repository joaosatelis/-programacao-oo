import java.util.Random;

/**
 * Classe que representa um Arqueiro.
 * Arqueiros possuem ataque médio com chance de acerto crítico.
 */
public class Arqueiro extends Personagem {
    private Random rand = new Random();

    public Arqueiro(String nome) {
        super(nome, 100, 20);
    }

    @Override
    public void atacar(Personagem inimigo) {
        boolean critico = rand.nextInt(100) < 25; // 25% de chance
        int dano = critico ? ataqueBase * 2 : ataqueBase;
        System.out.println(nome + " dispara uma flecha" + (critico ? " CRÍTICA!" : "!") + " Dano: " + dano);
        inimigo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        System.out.println(nome + " tentou esquivar, mas levou " + dano + " de dano.");
        hp -= dano;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " dispara sua Chuva de Flechas! Três ataques consecutivos são lançados!");
    }
}
