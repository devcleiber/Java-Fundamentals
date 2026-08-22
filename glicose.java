import java.util.Scanner;

public class glicose {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor da glicose: ");
        double glicose = scanner.nextDouble();

        if (glicose < 70) {
            System.out.println("Hipoglicemia");
        } else if (glicose >= 70 && glicose <= 99) {
            System.out.println("Normal");
        } else if (glicose >= 100 && glicose <= 125) {
            System.out.println("Pré-diabetes");
        } else {
            System.out.println("Diabetes");
        }

        scanner.close();
    }

}