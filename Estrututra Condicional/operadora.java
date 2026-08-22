import java.util.Scanner;

public class operadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de minutos: ");
        double minutos = scanner.nextDouble();
        double valorexcendente = minutos - 100;
        double valorapagar = 50 + (valorexcendente * 2);

        if (minutos <= 100) {
            System.out.println("O valor a ser pago é: R$ 50,00");
        } else {
            System.out.printf("O valor a ser pago é: R$ %.2f", valorapagar);
        }
        scanner.close();
    }
}
