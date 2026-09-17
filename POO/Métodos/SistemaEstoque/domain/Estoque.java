package SistemaEstoque.domain;

public class Estoque {
    private String nome;
    private double preco;
    private int quantidade;
    private double desconto;
    private double subtotal;


    // setters e getters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    // métodos de manipulação de estoque

    public void gerarSubtotal(){
        subtotal = this.preco * this.quantidade;
        System.out.println(subtotal);
        return;
    }
    public void desconto(){
        if (subtotal > 300) {
            desconto = subtotal * 0.10;
            System.out.println("Desconto de 10% aplicado: " + desconto);
        } else {
            System.out.println("Não há desconto aplicado.");
        }
        return;
    }
}
