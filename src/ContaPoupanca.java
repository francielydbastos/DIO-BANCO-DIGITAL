public class ContaPoupanca extends Conta{

    private static int NUMERO = 30000;

    public ContaPoupanca(Banco banco, int saldo, Cliente cliente){
        this.numero = NUMERO++;
        this.agencia = banco.getAgencia();
        this.saldo = saldo;
        this.cliente = cliente;
    }
}
