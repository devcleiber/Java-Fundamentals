import java.util.Scanner;

public class duracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a duração em segundos:");
        int segundos = scanner.nextInt();
        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos = segundos % 60;
        System.out.println("Duração: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos");
        scanner.close();
    }
}
