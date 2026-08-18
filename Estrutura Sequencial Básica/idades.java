import java.util.Scanner;

public class idades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();
        System.out.println("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();
        int soma = idade1 + idade2;
        int media = soma / 2;
        System.out.println("A Média das idades é: " + media);
        scanner.close();

    }

}
