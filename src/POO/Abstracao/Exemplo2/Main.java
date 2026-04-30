package POO.Abstracao.Exemplo2;

import POO.Polimorfismo.EXERCÍCIOS.Exercício2.Veículo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do pagamento.");
        double valorDaCompra = scanner.nextDouble();

        System.out.println("Escolha uma forma de pagamento: ");
        System.out.println("[1] - Pix");
        System.out.println("[2] - Boleto");
        int formaDePagamento = scanner.nextInt();
        if (formaDePagamento == 1){
            Pagamento pagamento = new Pix(valorDaCompra);
            pagamento.processar();
        } else if (formaDePagamento == 2) {
            Pagamento pagamento = new Boleto(valorDaCompra);
            pagamento.processar();
        } else {
            System.out.println("Digite certo a forma de pagamento!");
        }
    }
}
