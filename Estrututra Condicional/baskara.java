import java.util.Scanner;

public class baskara {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de B: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de C: ");
        double c = sc.nextDouble();
        double delta = (b * b) - (4 * a * c);

        if (delta < 0) {
            System.out.println("Não existem raízes reais");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("As raízes são: %.2f e %.2f", x1, x2);
        }
        sc.close();
    }
}