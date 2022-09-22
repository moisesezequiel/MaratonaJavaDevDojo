package devdojo.academy.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade =20;
        boolean isAutorizadoComprarBebida = idade >= 18;
        //Boleano recebendo expressao
        // !
        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado ! Pode comprar bebida ");
        } else {
            System.out.println("NAO Autorizado !");

        }

        //Pegadinha possivel de cair na prova
        //a variavel recebe o valor em memoria e assim fica sendo true
        boolean c = false;
        if (c = true){
            System.out.println("Dentro de algo que nunca sera executado");
        }

    }
}
