package devdojo.academy.introducao;

public class Exercicio01 {
    public static void main(String[] args) {
        //Dado um determinado salario anual eu quero saber qual o valor que eu tenho que pagar de imposto
        // 0 ate 34,712 pago 9,70%
        //34,715 ate 68,507  paga 37,35
        //acima de 68,507 paga 49,50

        double salario = 70.800;
        double primeiraFaixa = 9.7 /100;
        double segundaFaixa= 37.35 /100;
        double terceiraFaixa = 49.50 /100;


        double imposto =0.0;

        if (salario >= 0.0 && salario <= 34.712){
            imposto= salario * primeiraFaixa;
        } else if (salario > 34.712 && salario <= 68.507) {
            imposto = salario * segundaFaixa;
        }else {
            imposto = salario * terceiraFaixa;
        }
        System.out.println("Seu salario é " + salario + " e seu imposto é "+ imposto + " E o total do seu salario é = "
                + (salario -imposto));
    }
}
