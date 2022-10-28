package devdojo.academy.DintroducaoConstrutores.test;

import devdojo.academy.DintroducaoConstrutores.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive","TV",21,"drama");
            anime.imprime();
    }
}
