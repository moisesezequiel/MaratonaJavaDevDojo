package devdojo.academy.BintroducaoMetodos.test;

import devdojo.academy.BintroducaoMetodos.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Goku");
        p.setIdade(24);

        p.imprime();
    }

}
