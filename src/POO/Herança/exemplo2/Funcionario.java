package POO.Herança.exemplo2;

public class Funcionario {
    private String nome;
    private double salárioBase;

    public Funcionario(String nome, double salário) {
        this.nome = nome;
        this.salárioBase = salário;
    }

    public String getNome() {
        return nome;
    }

    public double getSalárioBase() {
        return salárioBase;
    }
}
