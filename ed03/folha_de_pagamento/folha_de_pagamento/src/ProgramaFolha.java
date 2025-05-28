/**
 * A classe ProgramaFolha é a classe principal que demonstra a criação e o uso
 * de diferentes tipos de funcionários em um sistema de folha de pagamento.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
class ProgramaFolha {
    /**
     * O método principal que inicia a execução do programa.
     * Cria instâncias de FuncionarioCLT e FuncionarioTemporario e exibe seus dados e salários.
     *
     * @param args Argumentos da linha de comando (não utilizados neste programa).
     */
    public static void main(String[] args) {
        // Criando instâncias de funcionários
        FuncionarioCLT carlos = new FuncionarioCLT("Carlos", 2000.00);
        FuncionarioTemporario ana = new FuncionarioTemporario("Ana", 2000.00);

        // Exibindo dados e salários para Carlos (CLT)
        System.out.println("--- Funcionário CLT ---");
        carlos.exibirDados();
        System.out.println("Salário Final: " + carlos.calcularSalario());
        System.out.println(); // Linha em branco para melhor visualização

        // Exibindo dados e salários para Ana (Temporário)
        System.out.println("--- Funcionário Temporário ---");
        ana.exibirDados();
        System.out.println("Salário Final: " + ana.calcularSalario());
    }
}