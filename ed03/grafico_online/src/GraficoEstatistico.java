/**
 * A classe GraficoEstatistico representa um gráfico estatístico imprimível.
 * Implementa a interface Imprimivel para exibir seu tipo de gráfico e título.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
class GraficoEstatistico implements Imprimivel {
    /**
     * O título do gráfico estatístico.
     */
    private String titulo;
    /**
     * O tipo do gráfico (ex: "pizza", "barra").
     */
    private String tipoGrafico;

    /**
     * Construtor para criar uma nova instância de GraficoEstatistico.
     *
     * @param titulo O título do gráfico.
     * @param tipoGrafico O tipo de gráfico (ex: "pizza", "barra").
     */
    public GraficoEstatistico(String titulo, String tipoGrafico) {
        this.titulo = titulo;
        this.tipoGrafico = tipoGrafico;
    }

    /**
     * Exibe o tipo do gráfico em letras maiúsculas, seguido pelo seu título em letras maiúsculas.
     */
    @Override
    public void imprimir() {
        System.out.println("Gráfico do tipo: " + tipoGrafico.toUpperCase());
        System.out.println("Título: " + titulo.toUpperCase());
    }
}