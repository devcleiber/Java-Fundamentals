import java.util.Scanner;

public class Lanchonete {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Codigo do produto comprado: ");
        int codigo = scanner.nextInt();

        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        double preco = 0;

        if (codigo == 1) {
            preco = 5.00;
        } else if (codigo == 2) {
            preco = 3.50;
        } else if (codigo == 3) {
            preco = 4.80;
        } else if (codigo == 4) {
            preco = 8.90;
        } else if (codigo == 5) {
            preco = 7.32;
        }

        double valor = preco * quantidade;

        System.out.printf("Valor a pagar: R$ %.2f%n", valor);

        scanner.close();
    }
}