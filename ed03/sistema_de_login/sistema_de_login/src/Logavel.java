/**
 * A interface Logavel define o comportamento de um objeto que pode registrar logs de auditoria.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
interface Logavel {
    /**
     * Registra uma operação específica no log de auditoria do sistema.
     *
     * @param operacao A descrição da operação a ser registrada.
     */
    void registrarLog(String operacao);
}