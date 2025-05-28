/**
 * A interface Imprimivel define um contrato para objetos que podem ser impressos.
 * Qualquer classe que implementa esta interface deve fornecer sua própria
 * lógica para exibir seus dados.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
interface Imprimivel {
    /**
     * Método responsável pela exibição dos dados do objeto de forma específica
     * para cada tipo de conteúdo imprimível.
     */
    void imprimir();
}