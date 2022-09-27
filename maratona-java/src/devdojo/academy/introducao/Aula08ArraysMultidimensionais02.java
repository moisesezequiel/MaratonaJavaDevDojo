package devdojo.academy.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        //Arrays multidimentcionais

        int [] array = {1,2,3};
        int[][] arrayInt = new int[3][];
        //4 formas de implementar arrays dimencionais
        arrayInt[0] = new int[2];
        arrayInt[1] = array;
        arrayInt[2] =  new int[]{1,2,3,4,5};

        int[][] arrayInt2 ={{0,0},{2,5,8},{5,4,1}};


        for (int[] arrayBase: arrayInt) {
            System.out.println("\n _____");
            for (int num : arrayBase) {
                System.out.println(num);
            }
            
        }
    }
}
