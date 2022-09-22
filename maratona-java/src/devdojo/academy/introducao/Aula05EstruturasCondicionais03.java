package devdojo.academy.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        //Doar se salario>5000
        double salario = 6000;
        String msgDoar = "Eu vou doar 500 reais";
        String msgNaoDoar = "Nao tenho condicao para doacao";
        String resultado;
        //(condicao) ? verdadeiro : falso
        resultado = salario>5000 ?msgDoar : msgNaoDoar;
        System.out.println(resultado);
    }
}
