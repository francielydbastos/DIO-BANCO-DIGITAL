public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco("Soulbank");

        Cliente cliente1 = new Cliente("Maria Antônia Silva");
        Cliente cliente2 = new Cliente("Joaquim dos Anjos");

        Conta contaCorrente1 = new ContaCorrente(banco, 0, cliente1);
        Conta contaPoupanca1 = new ContaPoupanca(banco, 400, cliente1);
        Conta contaPoupanca2 = new ContaPoupanca(banco, 200, cliente2);

        contaCorrente1.depositar(500);
        contaPoupanca1.transferir(contaCorrente1, 100);
        contaCorrente1.sacar(20);

        contaCorrente1.imprimirExtrato();
        contaPoupanca1.imprimirExtrato();
        contaPoupanca2.imprimirExtrato();
    }
}
