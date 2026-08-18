import java.util.Scanner;

public class retangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a largura: ");
        double largura = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();
        double area = largura * altura;
        double perimetro = 2 * (largura + altura);
        double diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
        System.out.println("A área do retângulo é: " + area);
        System.out.println("O perímetro do retângulo é: " + perimetro);
        System.out.println("A diagonal do retângulo é: " + diagonal);
        scanner.close();
    }
}
