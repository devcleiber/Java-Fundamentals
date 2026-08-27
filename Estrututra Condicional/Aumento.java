import java.util.Scanner;

public class Aumento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário atual: ");
        double salarioAtual = scanner.nextDouble();

        double aumento;
        if (salarioAtual < 1000) {
            aumento = salarioAtual * 0.20; // 20% de aumento
        } else if (salarioAtual < 3000) {
            aumento = salarioAtual * 0.15; // 15% de aumento
        } else if (salarioAtual < 8000) {
            aumento = salarioAtual * 0.10; // 10% de aumento
        } else {
            aumento = salarioAtual * 0.005; // 05% de aumento
        }

        double novoSalario = salarioAtual + aumento;

        System.out.printf("O novo salário após o aumento é: %.2f%n", novoSalario);
        System.out.printf("O aumento concedido foi de: %.2f%n", aumento);
        System.out.printf("O percentual de aumento aplicado foi de: %.2f%%%n", (aumento / salarioAtual) * 100);
        scanner.close();
    }
}