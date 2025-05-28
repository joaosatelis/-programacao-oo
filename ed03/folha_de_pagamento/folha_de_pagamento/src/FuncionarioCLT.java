/**
 * A classe FuncionarioCLT representa um funcionário contratado sob regime CLT.
 * Este tipo de funcionário recebe um adicional fixo ao seu salário base.
 *
 * @author Seu Nome
 * @version 1.0
 * @since 2025-05-28
 */
class FuncionarioCLT extends Funcionario {
    /**
     * Construtor para criar uma nova instância de FuncionarioCLT.
     *
     * @param nome O nome do funcionário CLT.
     * @param salarioBase O salário base do funcionário CLT.
     */
    public FuncionarioCLT(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Calcula o salário final para um funcionário CLT, adicionando um bônus fixo de R$ 300,00.
     *
     * @return O salário final do funcionário CLT.
     */
    @Override
    public double calcularSalario() {
        return salarioBase + 300.00; // Adicional fixo para CLT
    }
}