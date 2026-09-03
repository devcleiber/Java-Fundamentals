/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.*/

import java.util.Scanner;

public class negativos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Números negativos:");
        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        scanner.close();
    }
}
