package POO.Polimorfismo.Exemplo3;

public class Boleto extends MétodoPagamento{
    @Override
    public void pagarAvista() {
        System.out.println("Pagando com boleto...");
    }
}
