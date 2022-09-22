package devdojo.academy.introducao;

import java.util.Date;

/*
Pratica

Crie variaveis para o compos descritos abaixo

Eu <Nome > morando no endereço <Endereço> confirmo que recebi o salario de <Salario> na data <data>

 */
public class Aula03Exercicio {
    public static void main(String[] args) {
        String nome ="Moisés";
        String endereco =  "Av ourives";
        double salario = 2500.00;
        Date data = new Date();

        System.out.println("Eu " + nome +" morando no endereco: "+endereco +" Confirmo recebimento do salario = "+ salario
        +" na data :"+ data);
    }
}
