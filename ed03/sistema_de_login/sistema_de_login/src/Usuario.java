/**
 * A classe abstrata Usuario serve como a base para todos os tipos de usuários no sistema.
 * Ela contém atributos comuns a todos os usuários e um método para exibir o login.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
abstract class Usuario {
    /**
     * O nome de login do usuário.
     */
    protected String login;
    /**
     * A senha do usuário.
     */
    protected String senha;

    /**
     * Construtor para criar uma nova instância de Usuario.
     *
     * @param login O nome de login do usuário.
     * @param senha A senha do usuário.
     */
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    /**
     * Exibe o nome de login do usuário no console.
     */
    public void exibirLogin() {
        System.out.println("Login: " + login);
    }
}