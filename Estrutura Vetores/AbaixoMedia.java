/* Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida, mostrar na tela a média aritmética de todos elementos com três casas decimais Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */

import java.util.Scanner;

public class AbaixoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números (N): ");
        int n = scanner.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        double soma = 0;
        for (int i = 0; i < n; i++) {
            soma += numeros[i];
        }
        double media = soma / n;
        System.out.printf("Média: %.3f%n", media);
        System.out.println("Elementos abaixo da média:");
        for (int i = 0; i < n; i++) {
            if (numeros[i] < media) {
                System.out.printf("%.1f%n", numeros[i]);
            }
        }
        scanner.close();
    }

}