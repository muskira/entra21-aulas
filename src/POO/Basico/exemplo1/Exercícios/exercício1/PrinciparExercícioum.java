package POO.Basico.exemplo1.Exercícios.exercício1;

public class PrinciparExercícioum {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Fabiano";

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Chagas";

        aluno1.estudar();
        aluno2.estudar();
    }
}
