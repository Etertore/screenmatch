package br.com.etertore.exercicios_e_testes.Exercises.two;

public class Principal {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.dobrarNumero(5);
        int resultado = calculadora.dobrarNumero(20);
        System.out.println(resultado);
        System.out.println(calculadora.dobrarNumero(5));

    }
}
