package Exercises.Three;

public class Principal {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.titulo = "My Immortal";
        musica.artista = "Evanescence";
        musica.anoLancamento = 2003;

        musica.exibeFichaTecnica();


        musica.avalia(10);
        musica.avalia(9.8);
        musica.avalia(8.9);

        System.out.println("Notas dadas: " + musica.numAvaliacoes);

        System.out.println("Média das avaliações: " + musica.pegaMedia());
    }
}
