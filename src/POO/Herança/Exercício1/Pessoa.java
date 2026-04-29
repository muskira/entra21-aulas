package POO.Herança.Exercício1;

public class Pessoa {
    private String nome;
    private double idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }
    public void exibirInformacoes(){
        System.out.println("Nome: " this.nome);
        System.out.println("Idade: " this.idade);
}
}
