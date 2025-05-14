/**
 * Classe principal que executa o jogo de RPG simples.
 */
public class MainRpg {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("Thorgal");
        Mago m = new Mago("Merlino");
        Arqueiro a = new Arqueiro("Legolis");

        System.out.println("=== Status Inicial ===");
        g.status();
        m.status();
        a.status();

        System.out.println("\n=== Ação ===");
        g.atacar(m);
        m.usarHabilidadeEspecial();
        a.usarHabilidadeEspecial();

        System.out.println("\n=== Status Final ===");
        g.status();
        m.status();
        a.status();
    }
}
