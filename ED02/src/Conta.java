/**
 * Classer representando uma conta bancária genérica.
 */
public abstract class Conta {
    protected String cliente;
    protected double saldo;

    /**
     * Construtor da conta.
     * @param cliente nome do titular da conta
     * @param saldoInicial valor inicial da conta
     */
    public Conta(String cliente, double saldoInicial) {
        this.cliente = cliente;
        this.saldo = saldoInicial;
    }

    /**
     * Deposito de um valor na conta.
     * @param valor o valor a ser depositado na conta
     */
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    /**
     * Saca um valor da conta, se houver saldo suficiente.
     * @param valor o valor a ser sacado
     */
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        }
    }

    /**
     * Transferência de um valor para outra conta.
     * @param destino conta destino
     * @param valor valor a transferir
     */
    public void transferir(Conta destino, double valor) {
        if (valor > 0 && valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
        }
    }

    /**
     * Retorna o saldo atual da conta.
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Imprime o extrato da conta
     */
    public abstract void imprimirExtrato();

    /**
     * Aplicacao dos juros diários
     */
    public abstract void aplicarJurosDiarios();
}
