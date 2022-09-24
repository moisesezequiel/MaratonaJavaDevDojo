package devdojo.academy.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        //apenas variaveis do tipo reference podem ser inicializadas como null
        //arrays sao considerados objetos na memoria
        int [] idades = new int[3] ;
        idades[0] =21;
        idades[1] =41;
        idades[2] =10;
        System.out.println(idades[1]);
    }
}
