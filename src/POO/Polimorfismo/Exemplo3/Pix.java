package POO.Polimorfismo.Exemplo3;

public class Pix extends MétodoPagamento{
    @Override
    public void pagarAvista() {
        System.out.println("Pagando com Pix..");
    }
}
