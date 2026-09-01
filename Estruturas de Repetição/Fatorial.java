//Fazer um programa para ler um número natural N (valor máximo: 15), e depois calcular e mostrar o fatorial de N//

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número natural (máximo 15): ");
        int n = scanner.nextInt();
        int fatorial = 1;
        if (n < 0 || n > 15) {
            System.out.println("Número inválido. Digite um número entre 0 e 15.");
        } else {
            for (int i = 1; i <= n; i++) {
                fatorial *= i;
            }
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);
        scanner.close();
    }
}