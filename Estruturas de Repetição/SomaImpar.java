//Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números impares entre eles.//

import java.util.Scanner;

public class SomaImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        int x = scanner.nextInt();
        System.out.println("Digite o Segundo Valor:");
        int y = scanner.nextInt();

        if (x > y) {
            int temp = x;
            x = y;
            y = temp;
        }

        int soma = 0;
        for (int i = x + 1; i < y; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números ímpares entre " + x + " e " + y + " é: " + soma);

        scanner.close();
    }
}