/**
 * Classe abstrata que representa uma conta bancária genérica.
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
     * Deposita um valor na conta.
     * @param valor o valor a ser depositado
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
     * Transfere um valor para outra conta.
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
     * Imprime o extrato da conta (deve ser implementado pelas subclasses).
     */
    public abstract void imprimirExtrato();

    /**
     * Aplica os juros diários (deve ser implementado pelas subclasses).
     */
    public abstract void aplicarJurosDiarios();
}
