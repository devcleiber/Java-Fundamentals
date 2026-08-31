//Leia um valor inteiro N. Este valor será a quantidade de números inteiros que serão lidos em seguida. Para cada valor lido, mostre uma mensagem dizendo se este valor lido é PAR ou IMPAR, e também se é POSITIVO ou NEGATIVO. No caso do valor ser igual a zero (0), seu programa deverá imprimir apenas NULO.//

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int Valor = sc.nextInt();
            if (Valor == 0) {
                System.out.println("NULO");
            } else if (Valor % 2 == 0) {
                if (Valor > 0) {
                    System.out.println("PAR POSITIVO");
                } else {
                    System.out.println("PAR NEGATIVO");
                }
            } else {
                if (Valor > 0) {
                    System.out.println("IMPAR POSITIVO");
                } else {
                    System.out.println("IMPAR NEGATIVO");
                }
            }
        }

        sc.close();
    }
}