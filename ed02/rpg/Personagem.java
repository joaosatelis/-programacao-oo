/**
 * Classe base para todos os personagens do jogo de RPG.
 */
public abstract class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    public abstract void atacar(Personagem inimigo);

    public abstract void defender(int dano);

    public abstract void usarHabilidadeEspecial();

    /**
     * Exibe o status atual do personagem.
     */
    public void status() {
        System.out.println(nome + " | HP: " + hp);
    }
}
