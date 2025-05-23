/**
 * Classe que representa um Guerreiro.
 * Guerreiros têm ataque físico forte e boa defesa.
 */
public class Guerreiro extends Personagem {

    public Guerreiro(String nome) {
        super(nome, 150, 25);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " desferiu um poderoso golpe de espada!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        int reduzido = dano / 2;
        System.out.println(nome + " levantou seu escudo! Dano reduzido para " + reduzido);
        hp -= reduzido;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usa sua fúria em um Golpe Duplo!");
        int danoEspecial = ataqueBase * 2;
        System.out.println("Dano especial: " + danoEspecial + " (aplicado ao próximo inimigo manualmente)");
    }
}
