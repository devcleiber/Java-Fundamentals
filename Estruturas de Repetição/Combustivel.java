//Um posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4, devendo então mostrar a mensagem "MUITO OBRIGADO", bem como as quantidades de cada combustível.//

import java.util.Scanner;

public class Combustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int codigo;

        System.out.print("Informe o código do combustível (1,2,3 ou 4 Para Encerrar!): ");
        codigo = scanner.nextInt();

        while (codigo != 4) {
            if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            } else {
                System.out.println("Código inválido. Informe um código válido (1,2,3 ou 4): ");
            }

            System.out.print("Informe o código do combustível (1,2,3 ou 4 Para Encerrar!): ");
            codigo = scanner.nextInt();
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        scanner.close();
    }
}