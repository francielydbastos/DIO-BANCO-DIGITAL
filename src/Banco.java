import lombok.Data;

@Data
public class Banco {
    private String nome;
    private int agencia;

    private static int AGENCIA = 101;

    public Banco(String nome){
        this.nome = nome;
        this.agencia = AGENCIA++;
    }
}
