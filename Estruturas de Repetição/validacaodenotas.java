//Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.//

import java.util.Scanner;

public class validacaodenotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = -1;
        double nota2 = -1;

        // Validar primeira nota
        while (nota1 < 0 || nota1 > 10) {
            System.out.print("Digite a primeira nota: ");
            nota1 = scanner.nextDouble();
            if (nota1 < 0 || nota1 > 10) {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
            }
        }

        // Validar segunda nota
        while (nota2 < 0 || nota2 > 10) {
            System.out.print("Digite a segunda nota: ");
            nota2 = scanner.nextDouble();
            if (nota2 < 0 || nota2 > 10) {
                System.out.println("Nota inválida. Digite uma nota entre 0 e 10.");
            }
        }

        double media = (nota1 + nota2) / 2;
        System.out.println("A média semestral é: " + media);

        scanner.close();
    }

}