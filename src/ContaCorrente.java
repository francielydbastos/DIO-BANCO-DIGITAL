public class ContaCorrente extends Conta{

    private static int NUMERO = 10000;

    public ContaCorrente(Banco banco, int saldo, Cliente cliente){

        this.numero = NUMERO++;
        this.agencia = banco.getAgencia();
        this.saldo = saldo;
        this.cliente = cliente;
    }
}
