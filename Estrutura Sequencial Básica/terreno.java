import java.util.Scanner;

public class terreno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a largura: ");
        double largura = scanner.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();
        double area = largura * altura;
        System.out.println("A área do terreno é: " + area);
        scanner.close();
        double precoPorMetroQuadrado = 50.0; // Exemplo de preço por metro quadrado
        double precoTotal = area * precoPorMetroQuadrado;
        System.out.println("O preço total do terreno é: " + precoTotal);
    }
}