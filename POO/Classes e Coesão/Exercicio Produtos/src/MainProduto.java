import domain.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
       produto1.nome = "Old Par";
       produto1.preco = 180.0;
       produto1.estoque = 48;
    
       Produto produto2 = new Produto();
       produto2.nome = "Royal Salute";
       produto2.preco = 250.0;
       produto2.estoque = 30;
        
       System.out.println("Produto 1: " + produto1.nome + ", Preço: " + produto1.preco + ", Estoque: " + produto1.estoque);
       System.out.println("Produto 2: " + produto2.nome + ", Preço: " + produto2.preco + ", Estoque: " + produto2.estoque);
    }

}
