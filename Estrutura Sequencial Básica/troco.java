import java.util.Scanner;

public class troco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco, pago, troco;
        System.out.print("Digite o preço do produto: ");
        preco = sc.nextDouble();
        System.out.print("Digite o valor pago: ");
        pago = sc.nextDouble();
        troco = pago - preco;
        System.out.println("O troco é: R$ " + troco);
        sc.close();
    }
}