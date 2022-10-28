package devdojo.academy.DintroducaoConstrutores.domain;

public class Anime {
    private String tipo;
    private String nome;
    private int episodios;
    private String genero;
    private String studio;

    public Anime(){
        System.out.println("Dentro do construtor sem argumentos ");
    }
    public Anime(String tipo, String nome, int episodios, String genero) {
        this();//this para chamada do outro construtor vazio
        this.tipo = tipo;
        this.nome = nome;
        this.episodios = episodios;
        this.genero = genero;
    }

    public Anime(String tipo, String nome, int episodios, String genero, String studio) {
        //Apenas construtores podem chamar um ao outro e sempre tem que ser na primeira linha
        this( tipo,nome, episodios, genero); 
        this.studio= studio;
    }

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
