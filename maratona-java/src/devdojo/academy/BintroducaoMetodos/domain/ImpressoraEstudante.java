package devdojo.academy.BintroducaoMetodos.domain;

import devdojo.academy.AintroducaoClasses.domain.Estudante;

public class ImpressoraEstudante {
    public void imprimirEstudante(Estudante estudante){

        System.out.println("------------");
        System.out.println(estudante.idade);
        System.out.println(estudante.name);
        System.out.println(estudante.sexo);
    }
}
