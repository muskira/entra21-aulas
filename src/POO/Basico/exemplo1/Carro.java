package POO.Basico.exemplo1;

public class Carro {
    String cor;
    String modelo;
    String marca;
    int ano;
    Pessoa dono;

    void ligar() {
        dono.apresentar();
        System.out.println("BRUMMMMMMMMM");
    }
}
