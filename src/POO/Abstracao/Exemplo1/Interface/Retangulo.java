package POO.Abstracao.Exemplo1.Interface;

public class Retangulo implements IFormaGeometrica {
    private double Altura;
    private double Largura;

    public Retangulo(double altura, double largura) {
        Altura = altura;
        Largura = largura;
    }

    @Override
    public double calcularArea() {
        return 0;
    }
}
