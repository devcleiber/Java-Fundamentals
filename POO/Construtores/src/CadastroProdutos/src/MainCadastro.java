package CadastroProdutos;
import domain.Produto;

public class MainCadastro {
    public static void main(String[] args) {
        // Testar o construtor da classe Produto
        Produto produto = new Produto();

        System.out.println("Produto criado com construtor padrão.");

        // Testar o construtor da classe Produto com parâmetros
        Produto produtoComParametros = new Produto("Produto A", 10.0, 5);
        System.out.println("Produto criado com construtor com parâmetros.");
    }
}
