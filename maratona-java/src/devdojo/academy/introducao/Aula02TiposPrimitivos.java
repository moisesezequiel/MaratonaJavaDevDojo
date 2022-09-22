package devdojo.academy.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int,float,char,byte,float,short,long,boolean
        int idade = (int )10000000000L; //casting força o valor para o outro tipo porém ele corta os bytes necessarios
        long numeroGrande =(long)25000.45;
        double salarioDouble = 2000;
        float salarioFloat = 2501.0F; //convenção diz que melhor letra maiuscula no F
        byte idadeByte = 127;
        short idadeShort =32767;
        boolean verdade = true;
        char caractere = '\u0041';
     //   var nome2 = "Israel"; //no java 10 entrou essa convenção de não precisar explicitar o tipo da variavel

        String nome = "Moisés";

        System.out.println( "A idade é "+ idade);
        System.out.println( "valor "+ numeroGrande);
        System.out.println( "caractere  "+ caractere);
    }
}
