package POO.Herança.exemplo3;

public class Pricipal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("NICOTINA");
        produto.setPreco(100d);

        produto.exibirInformacoes();


        System.out.println("_______________");

        Livro livro = new Livro();
        livro.setNome("Nicolodelli");
        livro.setAutor("Muskira");
        livro.setPreco(40_000d); ;

        livro.exibirInformacoes();
    }
}
