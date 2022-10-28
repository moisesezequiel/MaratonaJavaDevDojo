package devdojo.academy.EblocosInicializacao.domain.domain;

public class Anime {
    private String nome;
    private int[] episodios ={1,2,4,5,5,6,7,8};

    //1 - Alocado espaco em memoria do objeto
    //2 - Cada atributo se nao for passado um valor ele se inicia default
    //3 - Bloco de inicializacao executa antes do construtor
    //4 - Construtor e executado

    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios= new int[100];
        for (int i = 0; i <episodios.length ; i++) {
            episodios[i]= i+1;
        }
    }

    public Anime() {
        for (int episodio: episodios) {
            System.out.println(episodio);

        }
        System.out.println();
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
