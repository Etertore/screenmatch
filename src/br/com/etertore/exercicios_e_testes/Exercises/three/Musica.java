package br.com.etertore.exercicios_e_testes.Exercises.three;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int somaDasAvaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica(){
        System.out.println("Nome da música: " + titulo);
        System.out.println("Nome do Artista: " + artista);
        System.out.println("Ano de Lançamento: " + anoLancamento);


    }
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        numAvaliacoes++;


    }

    double pegaMedia(){
        return somaDasAvaliacoes / numAvaliacoes;
    }

}
