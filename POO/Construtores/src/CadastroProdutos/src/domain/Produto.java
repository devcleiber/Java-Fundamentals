package domain;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto() { //sem parametro
        this.nome = "";
        this.preco = 0.0;
        this.quantidade = 0;
    }
    public Produto(String nome, double preco, int quantidade) { //com parametro
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}
