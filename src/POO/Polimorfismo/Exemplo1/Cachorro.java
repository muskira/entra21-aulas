package POO.Polimorfismo.Exemplo1;

    public class Cachorro extends Animal {

        @Override
        public void emitirSom() {
            System.out.println("Au Au!");
        }

        public void perseguirCarteiro() {
            System.out.println("Volta aqui au au au");
        }
}
