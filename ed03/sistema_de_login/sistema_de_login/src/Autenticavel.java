/**
 * A interface Autenticavel define o comportamento de um objeto que pode ser autenticado.
 * Classes que implementam esta interface devem fornecer sua própria lógica de autenticação.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
interface Autenticavel {
    /**
     * Verifica se a senha fornecida é válida para autenticação.
     *
     * @param senha A senha a ser verificada.
     * @return `true` se a senha for válida, `false` caso contrário.
     */
    boolean autenticar(String senha);
}