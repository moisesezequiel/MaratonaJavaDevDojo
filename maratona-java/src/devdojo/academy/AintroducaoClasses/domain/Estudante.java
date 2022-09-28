package devdojo.academy.AintroducaoClasses.domain;

public class Estudante {

    public String name;
    public int idade;
    public char sexo;


    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
