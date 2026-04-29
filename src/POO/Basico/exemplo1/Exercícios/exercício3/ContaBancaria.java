package POO.Basico.exemplo1.Exercícios.exercício3;

public class ContaBancaria {
    double saldo;
    public ContaBancaria(double saldo){
        if (saldo > 0) {
            System.out.println("Saldo inválido");
            //throw new IllegalArgumentException();
        }

        this.saldo = saldo;
    }
    void depositar(double valor){
        if (valor <= 0){
            System.out.println("Valor inválido");
        } else {
            this.saldo = this.saldo + valor;
        }
    }
    String sacar(double valor){
        if (valor <= 0){
            return "Valor Inválido";
        } else if (valor > saldo) {
            return "Saldo insuficiente";
        } else {
            this.saldo = this.saldo - valor;
            return "Saque efetuado, seu saldo é " + this.saldo;
        }
    }
}
