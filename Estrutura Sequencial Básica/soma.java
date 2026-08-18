import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Valor de X: ");
        int X = scanner.nextInt();
        System.out.println("Digite o Valor de Y: ");
        int Y = scanner.nextInt();
        int soma = X + Y;
        System.out.println("A soma de X + Y é: " + soma);
        scanner.close();
    }
}
