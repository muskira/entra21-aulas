package POO.Polimorfismo.Exemplo3;

public class CartãoDeCrédito extends MétodoPagamento{
    @Override
    public void pagarAvista() {
        System.out.println("Pagando com Cartão de Crédito...");
    }
}
