package devdojo.academy.CintroducaoSobrecargaMetodos.domain;

public class Anime {
    private String tipo;
    private String nome;
    private int episodios;
    private String genero;



    public void init(String nome,String tipo ,int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    //sobrecarga de metodos(mesmo nome,porem parametros e retorno podem ser diferentes)
    public void init(String nome,String tipo ,int episodios,String genero){
        this.init(nome,tipo,episodios);
        this.genero= genero;
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
