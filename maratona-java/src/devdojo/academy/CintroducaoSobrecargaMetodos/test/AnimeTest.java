package devdojo.academy.CintroducaoSobrecargaMetodos.test;

import devdojo.academy.CintroducaoSobrecargaMetodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akudama Drive","TV",21);
        anime.imprime();
    }
}
