package devdojo.academy.AintroducaoClasses.test;

import devdojo.academy.AintroducaoClasses.domain.Estudante;
import devdojo.academy.BintroducaoMetodos.domain.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.name ="Mises";
        estudante.idade=28;
        estudante.sexo ='M';

        estudante2.name ="Camila";
        estudante2.idade=22;
        estudante2.sexo ='F';

        estudante.imprime();
        estudante2.imprime();
    }
}
