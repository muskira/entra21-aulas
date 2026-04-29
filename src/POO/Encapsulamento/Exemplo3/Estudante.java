package POO.Encapsulamento.Exemplo3;

public class Estudante {
    private String matrícula;
    private double[] notas;

    public Estudante(String matrícula){
        this.matrícula = matrícula;
        this.notas = new double[4];
    }

    public Estudante(String matrícula, int nrNotas){
        this.matrícula = matrícula;
        this.notas = new double[nrNotas];
    }

    public void adicionarNotas(int posicao, double nota) {
        if (posicao < notas.length && posicao >= 0){
            if (nota >= 0 && nota <= 10){
                this.notas[posicao] = nota;
            }
        }
    }

    public double calcularMedia(){
        double soma = 0;
        for (double nota: notas){
            soma += nota;
        }

        return soma / notas.length;
    }
}
