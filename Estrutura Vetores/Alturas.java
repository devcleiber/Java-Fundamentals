/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.*/

import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de pessoas (N): ");
        int n = scanner.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];
        double somaAlturas = 0;
        double porcentagemMenores16 = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Pessoa " + (i + 1) + ":");
            System.out.print("Nome: ");
            nomes[i] = scanner.next();
            System.out.print("Idade: ");
            idades[i] = scanner.nextInt();
            System.out.print("Altura: ");
            alturas[i] = scanner.nextDouble();
            somaAlturas += alturas[i];
        }
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                porcentagemMenores16++;
            }
        }

        double mediaAlturas = somaAlturas / n;
        System.out.println("Altura média: " + mediaAlturas);
        System.out.println("Porcentagem de pessoas com menos de 16 anos: " + (porcentagemMenores16 / n * 100) + "%");
        scanner.close();
    }
}
