//Escreva um algoritmo que leia dois números e imprima o resultado da divisão do primeiro pelo segundo. Caso não for possível, mostre a mensagem “DIVISAO IMPOSSIVEL”.// 

import java.util.Scanner;

public class Divisão {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite quantos casos vai digitar: ");
        int n = entrada.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o Numerador número: ");
            double numerador = entrada.nextDouble();
            System.out.println("Digite o Denominador número: ");
            double denominador = entrada.nextDouble();

            if (denominador == 0) {
                System.out.println("DIVISAO IMPOSSIVEL");
            } else {
                double resultado = numerador / denominador;
                System.out.println("Resultado: " + resultado);
            }
        }
        entrada.close();
    }
}
