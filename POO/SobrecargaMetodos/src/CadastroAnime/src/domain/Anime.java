package domain;

public class Anime{
    private String nome;
    private String genero;
    private int episodios;
    private int temporadas;
    private String autor;

    //OPÇÃO 1: Sobrecarga de metodo com apenas o nome do anime,genero e episodio//
    public void cadastrarAnime(String nome, String genero, int episodios) {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        System.out.println("Cadastro de Anime:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Episódios: " + this.episodios);
    }
    //OPÇÃO 2: Sobrecarga de metodo com nome, gênero, episódios e temporadas
    public void cadastrarAnime(String nome, String genero, int episodios, int temporadas) {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.temporadas = temporadas;

        System.out.println("Cadastro de Anime:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Temporadas: " + this.temporadas);
    }
    //OPÇÃO 3: Sobrecarga de metodo com todos os parâmetros//
    public void cadastrarAnime(String nome, String genero, int episodios, int temporadas, String autor) {
        this.nome = nome;
        this.genero = genero;
        this.episodios = episodios;
        this.temporadas = temporadas;
        this.autor = autor;

        System.out.println("Cadastro de Anime:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Episódios: " + this.episodios);
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println("Autor: " + this.autor);
    }
}