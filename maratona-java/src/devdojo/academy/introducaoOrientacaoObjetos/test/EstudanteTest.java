package devdojo.academy.introducaoOrientacaoObjetos.test;

import devdojo.academy.introducaoOrientacaoObjetos.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name ="Mises";
        estudante.idade=28;
        estudante.sexo ='M';

        System.out.println(estudante.idade);
        System.out.println(estudante.name);
        System.out.println(estudante.sexo);
    }
}
