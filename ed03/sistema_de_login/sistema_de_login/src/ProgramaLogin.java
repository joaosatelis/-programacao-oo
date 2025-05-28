/**
 * A classe ProgramaLogin é a classe principal que demonstra a criação e o uso
 * de diferentes tipos de usuários no sistema de login, incluindo suas funcionalidades
 * de autenticação, gerenciamento e log.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
class ProgramaLogin {
    /**
     * O método principal que inicia a execução do programa.
     * Cria instâncias de Administrador, Visitante e Cliente e demonstra suas funcionalidades.
     *
     * @param args Argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        // Criando instâncias dos diferentes tipos de usuário
        Administrador admin = new Administrador("admin", "admin123");
        Visitante guest = new Visitante("guest", "qualquer");
        Cliente joao = new Cliente("joao", "segredo123");

        // --- Testando Administrador ---
        System.out.println("--- Administrador ---");
        admin.exibirLogin();
        System.out.println("Autenticação com 'admin123': " + admin.autenticar("admin123"));
        System.out.println("Autenticação com 'errada': " + admin.autenticar("errada"));
        admin.alterarSenha("novaSenhaAdmin");
        admin.bloquearUsuario();
        admin.registrarLog("Exclusão de conta");
        System.out.println(); // Linha em branco para separação

        // --- Testando Visitante ---
        System.out.println("--- Visitante ---");
        guest.exibirLogin();
        System.out.println();

        // --- Testando Cliente ---
        System.out.println("--- Cliente ---");
        joao.exibirLogin();
        System.out.println("Autenticação com 'segredo123': " + joao.autenticar("segredo123"));
        System.out.println("Autenticação com '12345': " + joao.autenticar("12345"));
    }
}