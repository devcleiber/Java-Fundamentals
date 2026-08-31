//Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, conforme exemplo //

import java.util.Scanner;

public class dentrofora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de valores que deseja informar: ");
        int n = scanner.nextInt();
        int dentro = 0;
        int fora = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um valor inteiro: ");
            int x = scanner.nextInt();
            if (x >= 10 && x <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }
        System.out.println("Dentro do intervalo: " + dentro);
        System.out.println("Fora do intervalo: " + fora);
        scanner.close();
    }
}