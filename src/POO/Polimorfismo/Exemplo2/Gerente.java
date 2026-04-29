package POO.Polimorfismo.Exemplo2;

public class Gerente extends Funcionário{

    @Override
    public double calcularPagamento() {
        return super.getSalarioBase() + 1000;
    }
}
