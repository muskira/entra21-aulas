package POO.Polimorfismo.Exemplo2;

public class Principal {
    public static void main(String[] args) {
        Funcionário gerente = new Gerente();
        gerente.setSalarioBase(10_000d);

        System.out.println("O salário do gerente é: " + gerente.getSalarioBase());

        Funcionário funcionárioComum = new Funcionário();
        funcionárioComum.setSalarioBase(3000d);
        System.out.println("O salário do funcionário é: " + funcionárioComum.calcularPagamento());

        Funcionário vendedor = new Vendedor(2000d, 3000d);
        System.out.println("O salário do vendedor é: " + vendedor.calcularPagamento());

    }
}
