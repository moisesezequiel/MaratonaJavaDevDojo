package devdojo.academy.BintroducaoMetodos.domain;

public class Calculadora {
    public  void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public  void subtraiDoisNumeros(){
        System.out.println(10-2);
    }
    public  void multiplicaDoisNumeros(int x, int y){
        System.out.println("Multiplicacao " + x * y);
    }

    public double divideDoisNumeros(int num1, int num2){
        if (num2 == 0) {
            System.out.println("Nao existe divisao por zero");
            return 0;
        }else {
            return num1 / num2;
        }
    }

    public void alterarDoisNumeros(int num1 , int num2 ){
        num1 = 50;
        num2= 33;
    }

    public void somaArray(int[] numeros){
        int soma =0;
        for (int num: numeros) {
            soma+=num;
        }
        System.out.println(soma);
    }

    //varArgs e a mesma coisa do metodo acima apenas foi criado para facilitar
    public void somaVarArgs(int...numeros){
        int soma =0;
        for (int num: numeros) {
            soma+=num;
        }
        System.out.println(soma);
    }
}
