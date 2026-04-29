package POO.Basico.exemplo1;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Fabiano",  18);

        Pessoa pessoa2 = new Pessoa();


        //pessoa1.apresentar();
        //pessoa2.apresentar();

        Carro carro1 = new Carro();
        carro1.ano = 1994;
        carro1.cor = "Vermelho";
        carro1.marca = "Gol";
        carro1.modelo = "GT";
        carro1.dono = pessoa2;//escolher a pessoa1 ou pessoa2

        carro1.ligar();



    }
}
