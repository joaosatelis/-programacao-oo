/**
 * Conta Corrente com juros de 0.1% ao dia.
 */
public class ContaCorrente extends Conta {

    public ContaCorrente(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.001; // 0.1% ao dia
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Corrente ===");
        System.out.println("Titular: " + cliente);
        System.out.printf("Saldo atual: R$ %.2f\n\n", saldo);
    }
}
