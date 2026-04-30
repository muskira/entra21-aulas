package POO.Polimorfismo.EXERCÍCIOS.Exercício2;

public class Principal {
    public static void main(String[] args) {
        Veículo veículoGenerico = new Veículo();
        Veículo carro = new Carro();
        Veículo bicicleta = new Bicicleta();

        veículoGenerico.Mover();
        carro.Mover();
        bicicleta.Mover();


    }
}
