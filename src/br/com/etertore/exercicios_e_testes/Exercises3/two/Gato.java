package br.com.etertore.exercicios_e_testes.Exercises3.two;

public class Gato extends Animal {

    public void arranharMoveis(){
        System.out.println("Arranhando o sofá");
    }

    @Override
    public void emitirsom() {
        System.out.println("Miau");
    }
}
