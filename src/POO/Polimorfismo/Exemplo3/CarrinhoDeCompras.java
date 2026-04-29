package POO.Polimorfismo.Exemplo3;

public class CarrinhoDeCompras {
    private double valorCompras;
    public CarrinhoDeCompras(double valorCompras){
        this.valorCompras = valorCompras;
    }
    public void realizarCompras(MétodoPagamento métodoPagamento){
        métodoPagamento.pagarAvista();
        System.out.println("Compra realizada com sucesso!");
    }
}
