package POO.Polimorfismo.Exemplo3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem Vindo!");
        System.out.println("Digite o valor da compra! ");
        double valorDaCompra = scanner.nextDouble();

        System.out.println("Escolha a forma de pagamento");
        System.out.println("[1] - Pix");
        System.out.println("[2] - Boleto");
        System.out.println("[3] - Cartão de Crédito");
        System.out.println("......");
        scanner.next();

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(valorDaCompra);
        int formaDePagamento = scanner.nextInt();

        switch (formaDePagamento) {
            case 1: {
                carrinhoDeCompras.realizarCompras(new Pix());
                break;
            }
            case 2: {
                carrinhoDeCompras.realizarCompras(new Boleto());
                break;
            }
            case 3: {
                carrinhoDeCompras.realizarCompras(new CartãoDeCrédito());
                break;
            }
            default: {
                throw new IllegalArgumentException();
            }
        }
    }

}