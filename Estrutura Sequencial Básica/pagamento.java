import java.util.Scanner;

public class pagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorHora, valorPago, Salario;
        System.out.println("Digite o valor das horas trabalhadas: ");
        valorHora = scanner.nextDouble();
        System.out.println("Digite o valor pago  ao funcionáriopor hora trabalha: ");
        valorPago = scanner.nextDouble();
        Salario = valorHora * valorPago;
        System.out.println("O salário é: " + Salario);
        scanner.close();
    }
}
