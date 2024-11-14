package Exercises2.three;

public class Principal {
    public static void main(String[] args) {

        Produto produto = new Produto("Celular", 2000.0);
        System.out.println("Nome do produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo preço após desconto: " + produto.getPreco());
    }
}
