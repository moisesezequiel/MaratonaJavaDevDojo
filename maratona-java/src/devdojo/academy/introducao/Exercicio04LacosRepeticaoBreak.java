package devdojo.academy.introducao;

public class Exercicio04LacosRepeticaoBreak {
    public static void main(String[] args) {
        //Dado um valor de um carro, descrubra em quantas vezes ele pode ser parcelado
        // Condicao valorParcela >=1000
        double valorTotal= 30000;
        for (int parcela =1; parcela<=valorTotal;parcela++){
            double valorParcela = valorTotal  / parcela;

            if (valorParcela >= 1000){
                System.out.println("Parcela "+ parcela + "R$ " +valorParcela);
            }else {
                break;
            }

            System.out.println("Fora do if e dentro do for " + parcela);
        }
    }
}
