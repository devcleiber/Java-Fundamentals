import java.util.Scanner;

public class notas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota do aluno: ");
        double nota2 = sc.nextDouble();
        double notaf = (nota1 + nota2) / 2;
        if (notaf >= 7.0) {
            System.out.println("Aprovado");
        } else if (notaf >= 5.0) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
        sc.close();
    }
}