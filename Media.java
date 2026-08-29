//Criar um sistma para ler um número indeterminado de dados, contendo cada um, a idade de um indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez, mostrar a mensagem "IMPOSSIVEL CALCULAR //

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as Idades: ");
        int idade = sc.nextInt();
        if (idade < 0) {
            System.out.println("IMPOSSIVEL CALCULAR");
        } else {
            int soma = idade;
            int count = 1;
            while (idade >= 0) {
                idade = sc.nextInt();
                if (idade >= 0) {
                    soma += idade;
                    count++;
                }
            }
            double media = (double) soma / count;
            System.out.println("A idade média é: " + media);
        }
        sc.close();
    }
}
