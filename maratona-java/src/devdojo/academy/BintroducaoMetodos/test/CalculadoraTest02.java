package devdojo.academy.BintroducaoMetodos.test;

import devdojo.academy.BintroducaoMetodos.domain.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] numeros = {1,2,3,5,4};
        System.out.println("SomaArray");
        calculadora.somaArray(numeros);

        System.out.println("Soma varArgs");

        //muda apenas a sintaxe
        //varArgs se houver outros parametros no metodo ele precisa ser o ultimo
        // a maioria das vezes ele precisa ser o unico parametro no metodo para nao haver confusao
        calculadora.somaVarArgs(4,5,4,8,6,12);
    }
}
