package devdojo.academy.BintroducaoMetodos.test;

import devdojo.academy.BintroducaoMetodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        calculadora.multiplicaDoisNumeros(10 ,4);

        double resultadoDivisao = calculadora.divideDoisNumeros(10,0);
        System.out.println(resultadoDivisao);
    }
}
