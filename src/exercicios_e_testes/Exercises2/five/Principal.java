package exercicios_e_testes.Exercises2.five;

public class Principal {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.setTitulo("O Senhor dos Anéis");
        livro1.setAutor("J. R. R. Tolkien");


        livro2.setTitulo("Harry Potter e a Pedra Filosofal");
        livro2.setAutor("J. K. Rowling");

        livro1.exibirDetalhes();
        System.out.println("===================");
        livro2.exibirDetalhes();


    }
}
