/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,considerando a primeira posição como 0 (zero). */

import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de números (N): ");
        int n = scanner.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        if (n > 0) {
            double maior = numeros[0];
            int posicaoMaior = 0;

            for (int i = 1; i < n; i++) {
                if (numeros[i] > maior) {
                    maior = numeros[i];
                    posicaoMaior = i;
                }
            }

            System.out.println("O maior número é: " + maior);
            System.out.println("A posição do maior número é: " + posicaoMaior);
        }
        scanner.close();
    }
}