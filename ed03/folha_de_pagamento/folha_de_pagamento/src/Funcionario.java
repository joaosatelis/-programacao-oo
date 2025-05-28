/**
 * A classe abstrata Funcionario serve como base para diferentes tipos de funcionários
 * no sistema de folha de pagamento. Ela define atributos comuns e um método
 * abstrato para cálculo de salário que deve ser implementado por suas subclasses.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
abstract class Funcionario {
    /**
     * O nome completo do funcionário
     */
    protected String nome;
    /**
     * O salário base do funcionário.
     */
    protected double salarioBase;

    /**
     * Construtor para criar uma nova instância de Funcionario.
     *
     * @param nome O nome do funcionário.
     * @param salarioBase O salário base do funcionário.
     */
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Exibe o nome e o salário base do funcionário no console.
     */
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: " + salarioBase);
    }

    /**
     * Método abstrato que deve ser implementado pelas subclasses para calcular
     * o salário final do funcionário, considerando suas especificidades.
     *
     * @return O salário final calculado para o funcionário.
     */
    public abstract double calcularSalario();
}