package br.com.etertore.principal;

import br.com.etertore.calculos.CalculadoraDeTempo;
import br.com.etertore.calculos.FiltroRecomendacao;
import br.com.etertore.modelos.Episodio;
import br.com.etertore.modelos.Filme;
import br.com.etertore.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.setNome("O Poderoso Chefão");
        filme.setAnoDeLancamento(1972);
        filme.setDuracaoEmMinutos(180);
        filme.setIncluidoNoPlano(true);

        filme.exibeFichaTecnica();
        filme.avalia(8);
        filme.avalia(10);
        filme.avalia(5);

        //System.out.println("Total de avaliações: "+ filme.getTotalDeAvaliacoes());

        System.out.println("Média de avaliações: " + filme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setMinutosPorEpisodio(50);
        serie.setEpisodiosPorTemporada(10);
        System.out.println("Duração para maratonar Lost: " + serie.getDuracaoEmMinutos() + " minutos");

        Filme filme2 = new Filme();
        filme2.setNome("O Senhor dos Anéis: A Sociedade do Anel");
        filme2.setAnoDeLancamento(2001);
        filme2.setDuracaoEmMinutos(210);
        filme2.setIncluidoNoPlano(true);

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.inclui(filme);
        calculadoraDeTempo.inclui(filme2);
        calculadoraDeTempo.inclui(serie);
        System.out.println(calculadoraDeTempo.getTempoTotal());


        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(filme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalDeVisualizacoes(300);
        filtroRecomendacao.filtra(episodio);
    }
}
