/**
 * A classe Cliente representa um usuário padrão do sistema.
 * Implementa apenas a interface Autenticavel com uma regra de senha específica.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
class Cliente extends Usuario implements Autenticavel {
    /**
     * Construtor para criar uma nova instância de Cliente.
     *
     * @param login O nome de login do cliente.
     * @param senha A senha do cliente.
     */
    public Cliente(String login, String senha) {
        super(login, senha);
    }

    /**
     * Autentica o cliente verificando se a senha fornecida tem mais de 6 caracteres
     * e corresponde exatamente à senha armazenada.
     *
     * @param senha A senha a ser verificada.
     * @return `true` se a senha for válida de acordo com as regras, `false` caso contrário.
     */
    @Override
    public boolean autenticar(String senha) {
        return senha.length() > 6 && this.senha.equals(senha);
    }
}