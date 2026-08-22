import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distancia percorrida em km: ");
        int distancia = scanner.nextInt();
        System.out.println("Digite o combustivel gasto em litros: ");
        int combustivel = scanner.nextInt();
        int consumo = distancia / combustivel;
        System.out.println("A média de consumo do veículo é: " + consumo + " km/l");
        scanner.close();
    }
}
