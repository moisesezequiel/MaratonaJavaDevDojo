package devdojo.academy.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //valores padroes da inicializadao de tipos primitivos
        //double,float,byte,short,int,long o valor inicial é 0
        //char '\u0000' = ' ' (espaco em branco)
        //boolean inicia como false
        //String e todos tipos de reference inicia como null

        String [] nomes = new String[3] ;

        nomes[0] = "Ichigo";
        nomes[1] = "Sasuke";
        nomes[2] = "Anya";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
