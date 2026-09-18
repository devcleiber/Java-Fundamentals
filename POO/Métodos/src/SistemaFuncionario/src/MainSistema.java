package SistemaFuncionario;
import SistemaFuncionario.domain.Funcionario;
import java.util.Scanner;

public class MainSistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Informe o nome do funcionário: ");
        funcionario.nome = scanner.nextLine();
        System.out.println("Informe a idade do funcionário: ");
        funcionario.idade = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner
        System.out.println("Informe os salários do funcionário (digite 'fim' para terminar): ");
        double[] salarios = new double[4];


        int i = 0;
        for (i = 0; i < 4; i++) {
            System.out.print("Informe o salário: " + (i + 1) + ": ");
            salarios[i] = scanner.nextDouble();
        }

        funcionario.salario = salarios;

        funcionario.imprimir();
    }
}
