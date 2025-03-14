package Exercises2.two;

public class idadePessoa {
    private String nome;
    private int idade;

    public idadePessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade(int idade) {
        if (idade >= 18) {
            System.out.println(nome + " é maior de idade");
        } else {
            System.out.println(nome + " é menor de idade");
        }


    }
    public void info(){
        System.out.println(getNome());
        System.out.println(getIdade());
        verificaIdade(getIdade());
    }

}
