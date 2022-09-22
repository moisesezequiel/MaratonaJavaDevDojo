package devdojo.academy.introducao;

public class Exercicio02Switch {
    public static void main(String[] args) {
        //utilizando switch  e dados os valores de 1 a 7, imprima dia util ou final de semana
        //Considerando 1 sendo domingo

        int dia = 7;

        switch (dia){
            case 1 :
            case 7 :
                System.out.println("Final de Semana!!");
                break;
            case 2 :
            case 3 :
            case 4:
            case 5 :
            case 6 :

                System.out.println("Dia Util");
                break;

            default:
                System.out.println("Opcao invalida");
                break;

        }
    }
}
