package SistemaEstoque;
import java.util.Scanner;
import SistemaEstoque.domain.Estoque;

public class MainEstoque {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var estoque = new Estoque();
        System.out.println("Digite o nome do produto:");
        estoque.setNome(scanner.nextLine());
        System.out.println("Digite o preço do produto:");
        estoque.setPreco(scanner.nextDouble());
        System.out.println("Digite a quantidade do produto:");
        estoque.setQuantidade(scanner.nextInt());
        System.out.println("Dados do produto:");
        System.out.println("Nome: " + estoque.getNome());
        System.out.println("Preço: " + estoque.getPreco());
        System.out.println("Quantidade: " + estoque.getQuantidade());

        System.out.println("Deseja gerar o subtotal do produto? (S/N)");
        String resposta = scanner.next();
        if (resposta.equalsIgnoreCase("S")) {
            System.out.println("Subtotal do produto:");
            estoque.gerarSubtotal();
            System.out.println("Verificando desconto:");
            estoque.desconto();
            scanner.close();
        } else {
            System.out.println("Operação cancelada.");
            scanner.close();
        }
    }
}
