package POO.Abstracao.Exemplo1.ClasseAbstrata;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(2);

        Retangulo retangulo = new Retangulo(3,4);

        double areaCirculo = circulo.calcularArea();
        double areaRetangulo = retangulo.calcularArea();

        System.out.println("A área do circulo é: " + areaCirculo);
        System.out.println("A área do retangulo é: " + areaRetangulo);

        FormaGeometricaAbstract quadrado = new Retangulo(2,2);
        System.out.println("A área do quadrado é: " + quadrado.calcularArea());
    }
}
