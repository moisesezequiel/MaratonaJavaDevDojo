package devdojo.academy.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        //Tres formas de iniciar um array
        int [] numeros = new int[3];
        int [] numeros2 = {2,5,7,8,4};
        int [] numeros3 = new int[]{2,5,7,8,4};;

        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]);
        }
        for (int num :numeros2 ) {
            System.out.println("for Each "+num);
        }
    }
}
