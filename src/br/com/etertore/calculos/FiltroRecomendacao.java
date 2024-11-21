package br.com.etertore.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getclassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getclassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento");
        }else {
            System.out.println("Coloque na sua lista para assistir");
        }

    }
}
