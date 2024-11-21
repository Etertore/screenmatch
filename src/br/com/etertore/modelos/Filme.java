package br.com.etertore.modelos;

import br.com.etertore.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getclassificacao() {
        return (int) pegaMedia() / 2;
    }
}
