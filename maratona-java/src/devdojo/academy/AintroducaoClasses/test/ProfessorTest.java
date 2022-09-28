package devdojo.academy.AintroducaoClasses.test;

import devdojo.academy.AintroducaoClasses.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.name ="Mestre kame";
        prof.idade=255;
        prof.sexo ='M';

        System.out.println("Nome = "+prof.name + " Idade= "+ prof.idade + "Sexo = "+ prof.sexo);
    }
}
