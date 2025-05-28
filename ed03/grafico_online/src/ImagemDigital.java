/**
 * A classe ImagemDigital representa uma imagem digital imprimível.
 * Implementa a interface Imprimivel para exibir seu nome de arquivo e resolução.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
class ImagemDigital implements Imprimivel {
    /**
     * O nome do arquivo da imagem digital (ex: "foto.jpg").
     */
    private String nomeArquivo;
    /**
     * A resolução da imagem digital (ex: "1920x1080").
     */
    private String resolucao;

    /**
     * Construtor para criar uma nova instância de ImagemDigital.
     *
     * @param nomeArquivo O nome do arquivo da imagem.
     * @param resolucao A resolução da imagem.
     */
    public ImagemDigital(String nomeArquivo, String resolucao) {
        this.nomeArquivo = nomeArquivo;
        this.resolucao = resolucao;
    }

    /**
     * Exibe o nome do arquivo da imagem e sua resolução.
     */
    @Override
    public void imprimir() {
        System.out.println("Arquivo: " + nomeArquivo);
        System.out.println("Resolução: " + resolucao);
    }
}