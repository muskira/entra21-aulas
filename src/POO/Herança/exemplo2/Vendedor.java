package POO.Herança.exemplo2;

public class Vendedor extends Funcionario{
    private double comissao;

    public Vendedor(String nome, double salárioBase, double comissao) {
        super(nome, salárioBase);
        this.comissao = comissao;
    }

    public double getSalarioTotal(){
        return this.getSalárioBase() + this.comissao;
    }
}
