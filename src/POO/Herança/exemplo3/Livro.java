package POO.Herança.exemplo3;

public class Livro {

    private String autor;

   @Override
    public void exibirInformacoes(){
        super.exibirInformacoes();
        System.out.println("Autor: " + this.autor);
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
