package devdojo.academy.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {

        //operadores aritimeticos + - * /
        int x = 10;
        int y = 5;

        System.out.println(  x+y+  "string que transforma a expressão"+ x+y); // toda vez que tiver uma string em uma expressão a proxima adição vira de contatenação

        int numero1 = 10;
        int numero2 = 20;
        double  resultado = numero1 /(double) numero2; // ZERO ao menos que use o casting
        // 0 toda divisão de numero inteiro o resultado sai inteiro

        System.out.println( resultado);

        //% resto
        int resto = 10%2; //geralmente para operaçoes para saber se o final será par ou impar
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualQueVinte = 10==20;
        boolean isDezDiferenteQueVinte = 10!=20;

        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualQueVinte);
        System.out.println(isDezDiferenteQueVinte);

        //Operadores Logicos ||(OR)  &&(AND) !

        int idade =29;
        float salario = 4000F;
        boolean isMaiorQueTrita = idade >= 30 && salario >=4106 ;
        boolean isMenorQueTrita = idade < 30 && salario <= 3385f;

        System.out.println("isMaiorQueTrita " + isMaiorQueTrita);
        System.out.println(isMenorQueTrita);


        double totalContaCorrente = 200;
        double totalContaPoupanca = 10000;
        float  valorPlayStation = 5000F;
        boolean ps5Compravel = totalContaCorrente > valorPlayStation || totalContaPoupanca >valorPlayStation;
        //compravel sim ou não

        System.out.println("PS5 é compravel ? " + ps5Compravel);


        //Operadores
        // = += -= /= %=  ++ --

        double bonus = 1800;
         bonus = bonus + 1000;
        System.out.println(bonus);

        int contador = 0;
        System.out.println(contador++);
        System.out.println(++contador);
    }
}
