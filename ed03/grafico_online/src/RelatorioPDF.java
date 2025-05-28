/**
 * A classe RelatorioPDF representa um relatório em formato PDF imprimível.
 * Implementa a interface Imprimivel para exibir o nome do autor e o número total de páginas.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
class RelatorioPDF implements Imprimivel {
    /**
     * O nome do autor do relatório PDF.
     */
    private String autor;
    /**
     * O número total de páginas do relatório PDF.
     */
    private int numeroPaginas;

    /**
     * Construtor para criar uma nova instância de RelatorioPDF.
     *
     * @param autor O nome do autor do relatório.
     * @param numeroPaginas O número total de páginas do relatório.
     */
    public RelatorioPDF(String autor, int numeroPaginas) {
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Exibe o nome do autor e o número total de páginas do relatório PDF.
     */
    @Override
    public void imprimir() {
        System.out.println("Autor: " + autor);
        System.out.println("Total de páginas: " + numeroPaginas);
    }
}