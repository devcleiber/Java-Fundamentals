//O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá parar quando o valor de X for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X, se for par. Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação: 4+6+8+10+12, enquanto que se o valor de entrada for 11, por exempo, a saída deve ser 80, que é a soma de 12+14+16+18+20.//

import java.util.Scanner;

public class pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro (0 para sair): ");
        int x = scanner.nextInt();

        while (x != 0) {
            int soma = 0;
            int i = 0;
            if (x % 2 != 0) {
                x++;
            }
            for (i = 0; i < 5; i++) {
                soma += x + i * 2;
            }
            System.out.println(soma);
            System.out.println("Digite um valor inteiro (0 para sair): ");
            x = scanner.nextInt();
        }

        scanner.close();

    }
}
