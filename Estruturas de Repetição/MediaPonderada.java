//Leia um valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, para os quais você deverá calcular e mostrar a média ponderada, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5. Vale lembrar que a média ponderada é a soma de todos os valores multiplicados pelo seu respectivo peso, dividida pela soma dos pesos. //

import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        for (int i = 0; i < n; i++) {
            float valor1 = entrada.nextFloat();
            float valor2 = entrada.nextFloat();
            float valor3 = entrada.nextFloat();

            float mediaPonderada = (valor1 * 2 + valor2 * 3 + valor3 * 5) / (2 + 3 + 5);
            System.out.printf("%.1f%n", mediaPonderada);
            entrada.close();
        }
        entrada.close();
    }
}