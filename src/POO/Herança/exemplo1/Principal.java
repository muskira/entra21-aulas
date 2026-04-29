package POO.Herança.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa (  18, "Fabiano");
        Aluno aluno = new Aluno( 18, "Chagas", "xxxx");

        aluno.apresentar();

        System.out.println("Nome aluno: " + aluno.getNome());
        System.out.println("Idade aluno: " + aluno.getIdade());
        System.out.println("Matricula aluno: " + aluno.getMatricula());

    }
}
