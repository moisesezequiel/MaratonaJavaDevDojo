package devdojo.academy.exercicio.domain;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salario;

    private double media = 0;


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

        if (salario == null){
            return;
        }
        for (double salario : salario) {
            media += salario;
        }
        media /= salario.length;
        System.out.println("Media Salarial :" + media);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }

}

