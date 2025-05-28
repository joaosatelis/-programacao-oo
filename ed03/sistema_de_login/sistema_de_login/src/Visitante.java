/**
 * A classe Visitante representa um usuário com acesso restrito ao sistema.
 * Não implementa nenhuma interface de funcionalidade adicional.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
class Visitante extends Usuario {
    /**
     * Construtor para criar uma nova instância de Visitante.
     *
     * @param login O nome de login do visitante.
     * @param senha A senha do visitante (pode ser ignorada para fins de acesso restrito).
     */
    public Visitante(String login, String senha) {
        super(login, senha);
    }

    /**
     * Sobrescreve o método exibirLogin() para indicar que o acesso do visitante é restrito.
     */
    @Override
    public void exibirLogin() {
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
}