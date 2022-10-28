package devdojo.academy.exercicio.test;

import devdojo.academy.exercicio.domain.Funcionario;

//Crie uma classe de funcionario com os seguintes atributos
//nome,idade,salario(3x salarios)

//crie 2 metodos
//1 para imprimir os dados
//2 para tirar a media dos salarios e imprimir

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Israel");
        funcionario.setIdade(2);
        funcionario.setSalario(new double[]{21,24,42});

        funcionario.imprimeDados();

    }
}
