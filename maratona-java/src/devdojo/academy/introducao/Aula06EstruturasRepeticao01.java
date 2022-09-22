package devdojo.academy.introducao;

public class Aula06EstruturasRepeticao01 {
    public static void main(String[] args) {
        //while , do while , for
        //sempre implementar a variavel dentro do bloco do while
        //sempre os indices comecam com zero 

        //While
        int count = 0;
        while (count < 10){
            count++;
            System.out.println(count);

        }

        //Do While pelo menos o do ira executar pelo menos 1 vez
        count =0;
        do {
            System.out.println("Sempre ira executar pelo menos uma vez"+ ++count);
        }while (count < 12);{
            System.out.println(++count);

        }


        //for
        //o for e indexado

        for (int i=0 ;i <10;i++){
            System.out.println("FOR + i " + i);
        }
    }
}
