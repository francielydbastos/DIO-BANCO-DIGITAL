import lombok.Data;

@Data
public abstract class Conta {
    protected int agencia;
    protected long numero;
    protected double saldo;
    protected Cliente cliente;

    public void sacar(double valor) {
        if (valor <= this.saldo){
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso! O novo saldo é de " + this.saldo);
        } else {
            System.out.println("Não foi possível realizar o saque pois a conta não tem saldo suficiente."
            + "\n O saldo atual é de " + this.saldo);
        }
    }

    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso! O novo saldo é de " + this.saldo);
    }

    public void transferir(Conta contaDestino, double valor) {
        if (valor <= this.saldo){
            this.saldo -= valor;
            contaDestino.setSaldo(contaDestino.getSaldo() + valor);
        } else {
            System.out.println("Não foi possível realizar a transferência pois a conta de origem não tem saldo suficiente."
                    + "\n O saldo atual é de " + this.saldo);
        }
    }

    public void imprimirExtrato(){
        System.out.println("/////// EXTRATO DA CONTA ///////");
        System.out.println("Cliente: " + this.cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }
}
