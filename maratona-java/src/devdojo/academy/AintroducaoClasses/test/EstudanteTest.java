package devdojo.academy.AintroducaoClasses.test;

import devdojo.academy.AintroducaoClasses.domain.Estudante;
import devdojo.academy.BintroducaoMetodos.domain.ImpressoraEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante.name ="Mises";
        estudante.idade=28;
        estudante.sexo ='M';

        estudante2.name ="Camila";
        estudante2.idade=22;
        estudante2.sexo ='F';


        impressora.imprimirEstudante(estudante);
        impressora.imprimirEstudante(estudante2);
    }
}
