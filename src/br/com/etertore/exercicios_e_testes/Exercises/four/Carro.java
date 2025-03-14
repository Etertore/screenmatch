package Exercises.four;

public class Carro {
    String modelo;
    int ano;
    String cor;


    void exibeFichaTecnica(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Cor " + cor);
        System.out.println("Ano: " + ano);
    }

    int calculeIdade(){
        return 2024 - ano;
    }
}
