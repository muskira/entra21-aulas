package POO.Abstracao.Exemplo1.ClasseAbstrata;

public class Retangulo extends FormaGeometricaAbstract{

    private double Altura;
    private double Largura;

    public Retangulo(double altura, double largura){
        this.Altura = altura;
        this.Largura = largura;
    }


    @Override
    double calcularArea() {

    }
}
