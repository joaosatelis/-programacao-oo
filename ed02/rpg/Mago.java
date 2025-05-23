/**
 * Classe que representa um Mago.
 * Magos têm ataque mágico forte, mas pouca defesa.
 */
public class Mago extends Personagem {

    public Mago(String nome) {
        super(nome, 80, 30);
    }

    @Override
    public void atacar(Personagem inimigo) {
        System.out.println(nome + " conjura uma rajada mágica!");
        inimigo.defender(ataqueBase);
    }

    @Override
    public void defender(int dano) {
        System.out.println(nome + " tentou se proteger com magia, mas sofreu " + dano + " de dano.");
        hp -= dano;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lança Bola de Fogo! Todos os inimigos imaginários queimam!");
    }
}
