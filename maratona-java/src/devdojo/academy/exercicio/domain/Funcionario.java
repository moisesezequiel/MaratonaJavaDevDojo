package devdojo.academy.exercicio.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;


    public void imprimeDados() {
        System.out.println("Nome " + this.nome);
        System.out.println("Idade " + this.idade);
        if (salario == null){
            return;
        }
        for (double valor : salario) {
            System.out.println("Salario " + valor);
        }
        mediaSalario();
    }

    public void mediaSalario() {
        double media = 0;
        if (salario == null){
            return;
        }
        for (double salario : salario) {
            media += salario;
        }
        media /= salario.length;
        System.out.println("Media Salarial :" + media);

    }


}

