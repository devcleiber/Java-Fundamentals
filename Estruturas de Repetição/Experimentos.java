//Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um programa que leia um valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.//

import java.util.Scanner;

public class Experimentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCobaias = 0;
        int totalCoelhos = 0;
        int totalRatos = 0;
        int totalSapos = 0;

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int quantidade = scanner.nextInt();
            char tipo = scanner.next().charAt(0);

            totalCobaias += quantidade;

            if (tipo == 'C') {
                totalCoelhos += quantidade;
            } else if (tipo == 'R') {
                totalRatos += quantidade;
            } else if (tipo == 'S') {
                totalSapos += quantidade;
            }
        }

        double percentualCoelhos = (totalCoelhos * 100.0) / totalCobaias;
        double percentualRatos = (totalRatos * 100.0) / totalCobaias;
        double percentualSapos = (totalSapos * 100.0) / totalCobaias;

        System.out.println("Total: " + totalCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalCoelhos);
        System.out.println("Total de ratos: " + totalRatos);
        System.out.println("Total de sapos: " + totalSapos);
        System.out.printf("Percentual de coelhos: %.2f %%\n", percentualCoelhos);
        System.out.printf("Percentual de ratos: %.2f %%\n", percentualRatos);
        System.out.printf("Percentual de sapos: %.2f %%\n", percentualSapos);
        scanner.close();
    }
}
