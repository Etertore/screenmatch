package Exercises.four;

public class Principal {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.modelo = "BMW";
        carro.ano = 1995;
        carro.cor = "Verde";

        carro.exibeFichaTecnica();

        System.out.println(carro.calculeIdade());

    }


}




