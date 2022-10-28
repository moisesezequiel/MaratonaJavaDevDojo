package devdojo.academy.EblocosInicializacao.domain.test;

import devdojo.academy.EblocosInicializacao.domain.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + "");
        }

    }
}
