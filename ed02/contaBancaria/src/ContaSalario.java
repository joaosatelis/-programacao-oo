/**
 * Conta Salário que não aplica juros.
 */
public class ContaSalario extends Conta {

    public ContaSalario(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        // Conta Salário não tem juros
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Salário ===");
        System.out.println("Titular: " + cliente);
        System.out.printf("Saldo atual: R$ %.2f\n\n", saldo);
    }
}
