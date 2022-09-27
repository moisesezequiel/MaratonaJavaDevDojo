package devdojo.academy.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //Array de meses 1 a 12 meses
        //Array de dias do mes  1 a 31 dias

        int[][] dias = new int[3][3];

        //Cada posicao do array equivale a um outro array da mesma posicao (neste caso)
        dias[0][0] =10;
        dias[0][1] = 9;
        dias[0][2] = 8;

        dias[1][0] =7;
        dias[1][1] =6;
        dias[1][2] =5;

        dias[2][0] =4;
        dias[2][1] =3;
        dias[2][2] =2;

        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j < dias[i].length ; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("______________________");

        for (int[] arrayBase: dias) {
            for (int num : arrayBase) {
                System.out.println("Foreach "+ num);
            }
            
        }
    }
}
