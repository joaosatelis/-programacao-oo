/**
 * A classe FuncionarioTemporario representa um funcionário com contrato temporário.
 * Este tipo de funcionário tem um desconto fixo em seu salário base.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
class FuncionarioTemporario extends Funcionario {
    /**
     * Construtor para criar uma nova instância de FuncionarioTemporario.
     *
     * @param nome O nome do funcionário temporário.
     * @param salarioBase O salário base do funcionário temporário.
     */
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final para um funcionário temporário, aplicando um desconto fixo de R$ 100,00.
     *
     * @return O salário final do funcionário temporário.
     */
    @Override
    public double calcularSalario() {
        return salarioBase - 100.00; // Desconto fixo para Temporário
    }
}