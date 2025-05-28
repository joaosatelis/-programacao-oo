/**
 * A classe DocumentoTexto representa um documento textual imprimível.
 * Implementa a interface Imprimivel para exibir seu título e conteúdo.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
class DocumentoTexto implements Imprimivel {
    /**
     * O título do documento de texto.
     */
    private String titulo;
    /**
     * O conteúdo textual do documento.
     */
    private String conteudo;

    /**
     * Construtor para criar uma nova instância de DocumentoTexto.
     *
     * @param titulo O título do documento.
     * @param conteudo O conteúdo do texto do documento.
     */
    public DocumentoTexto(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    /**
     * Exibe o título do documento em letras maiúsculas, seguido pelo seu conteúdo.
     */
    @Override
    public void imprimir() {
        System.out.println(titulo.toUpperCase());
        System.out.println(conteudo);
    }
}