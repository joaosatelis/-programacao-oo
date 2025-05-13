/**
 * Classe principal para testar o sistema bancário.
 */
public class Main {
    public static void main(String[] args) {
        // Criando contas
        ContaCorrente cc = new ContaCorrente("Alice", 1000);
        ContaPoupanca cp = new ContaPoupanca("Bob", 1500);
        ContaSalario cs = new ContaSalario("Carlos", 1200);

        // Operações bancárias
        cc.depositar(200);
        cp.sacar(100);
        cs.transferir(cc, 300);

        // Aplicando juros diários
        cc.aplicarJurosDiarios();
        cp.aplicarJurosDiarios();
        cs.aplicarJurosDiarios(); // Não faz nada

        // Mostrando extratos
        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cs.imprimirExtrato();
    }
}