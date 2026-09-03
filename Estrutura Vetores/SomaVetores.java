/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 * - Imprimir todos os elementos do vetor
 * - Mostrar na tela a soma e a média dos elementos do vetor */

import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números (N): ");
        int n = scanner.nextInt();

        double[] vetor = new double[n];
        double soma = 0;

        System.out.println("Digite os " + n + " números reais:");
        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextDouble();
            soma += vetor[i];
        }

        System.out.println("Elementos do vetor:");
        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }

        double media = soma / n;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

        scanner.close();
    }
}
