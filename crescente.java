import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        do {
            System.out.println("Digite dois números: ");
            x = sc.nextInt();
            y = sc.nextInt();

            if (x > y) {
                System.out.println("Decrescente! ");
            } else if (x < y) {
                System.out.println("Crescente! ");
            } else {
                System.out.println("Números iguais! ");
            }
        } while (x != y);
    }
}