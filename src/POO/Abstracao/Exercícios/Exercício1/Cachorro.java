package POO.Abstracao.Exercícios.Exercício1;

public class Cachorro extends AnimalAbstract{

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au");
    }
}
