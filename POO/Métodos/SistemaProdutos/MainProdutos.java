package SistemaProdutos;

import domain.Produtos;
import java.util.Scanner;

public class MainProdutos {
    public static void main(String[] args) {
        // importando as classes e pacotes.
        Produtos produto = new Produtos();
        Scanner scanner = new Scanner(System.in);

        // calculando subtotal da compra.
        System.out.println("Produto 1:");
        double produto1 = scanner.nextDouble();
        System.out.println("Produto 2:");
        double produto2 = scanner.nextDouble();
        System.out.println("Produto 3:");
        double produto3 = scanner.nextDouble();

        double subtotal = produto.subtotalCompra(produto1, produto2, produto3);
        System.out.println("Subtotal: " + subtotal);

        Double totalComDesconto = produto.descontoCompra;
        System.out.println("Total com desconto: " + totalComDesconto);

        // calculando total da compra.
        double total = produto.totalCompra(subtotal, desconto);
        System.out.println("Total da compra: " + total);
    }
}
