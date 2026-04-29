package POO.Herança.exemplo2;

public class Principal {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Muskira", 2312.0);
        Vendedor vendedor = new Vendedor("Muskira", 100_000d, 500_000d);
        System.out.println("O salário total de " + vendedor.getNome() +
                " é " + vendedor.getSalarioTotal());
    }
}
