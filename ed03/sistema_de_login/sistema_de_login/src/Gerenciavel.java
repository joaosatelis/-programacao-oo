/**
 * A interface Gerenciavel define operações administrativas que podem ser realizadas em um usuário.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
interface Gerenciavel {
    /**
     * Altera a senha do usuário para a nova senha fornecida.
     *
     * @param novaSenha A nova senha a ser definida.
     */
    void alterarSenha(String novaSenha);

    /**
     * Bloqueia o acesso do usuário ao sistema.
     */
    void bloquearUsuario();
}