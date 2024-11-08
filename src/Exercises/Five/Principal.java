package Exercises.Five;

public class Principal {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno.nome = "Supremo";
        aluno.idade = 20;
        aluno2.nome = "Joao";
        aluno2.idade = 30;

        aluno.exibeInformacoes();

        System.out.println("====================");
        aluno2.exibeInformacoes();
    }

}
