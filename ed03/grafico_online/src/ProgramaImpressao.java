/**
 * A classe ProgramaImpressao é a classe principal que demonstra a criação e o uso
 * de diferentes objetos que implementam a interface Imprimivel.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
class ProgramaImpressao {
    /**
     * O método principal que inicia a execução do programa.
     * Cria instâncias de DocumentoTexto, ImagemDigital, GraficoEstatistico e RelatorioPDF
     * e chama o método imprimir() em cada uma.
     *
     * @param args Argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        // Criando instâncias de diferentes tipos imprimíveis
        DocumentoTexto doc1 = new DocumentoTexto("Documento de Apresentação", "Este é o conteúdo do documento.");
        ImagemDigital img1 = new ImagemDigital("paisagem.jpg", "1920x1080");
        GraficoEstatistico grafico1 = new GraficoEstatistico("Distribuição de Vendas", "barra");
        RelatorioPDF relatorio1 = new RelatorioPDF("João Silva", 12);

        // Chamando o método imprimir() em cada instância
        doc1.imprimir();
        System.out.println(); // Linha em branco para melhor visualização
        img1.imprimir();
        System.out.println();
        grafico1.imprimir();
        System.out.println();
        relatorio1.imprimir();
    }
}