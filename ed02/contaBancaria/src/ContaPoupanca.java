/**
 * Conta Poupança com juros de 0.08% ao dia.
 */
public class ContaPoupanca extends Conta {

    public ContaPoupanca(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.0008; // 0.08% ao dia
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato da Conta Poupança ===");
        System.out.println("Titular: " + cliente);
        System.out.printf("Saldo atual: R$ %.2f\n\n", saldo);
    }
}
