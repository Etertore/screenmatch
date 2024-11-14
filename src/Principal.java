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

        //System.out.println("Total de avaliações: " + filme.getTotalDeAvaliacoes());

        System.out.println("Média de avaliações: " + filme.pegaMedia());

        Serie serie = new Serie();
        serie.setNome("Lost");
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        serie.setTemporadas(10);
        serie.setMinutosPorEpisodio(50);
        serie.setEpisodiosPorTemporada(10);
        System.out.println("Duração para maratonar Lost :" + serie.getDuracaoEmMinutos());
    }
}
