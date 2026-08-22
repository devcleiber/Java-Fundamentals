import java.util.Scanner;

public class medidas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Aq o sistema vai ler as 3 medidas do usuario;
        System.out.println("Digite a medida de X");
        double x = scanner.nextDouble();
        System.out.println("Digite a medida de Y");
        double y = scanner.nextDouble();
        System.out.println("Digite a medida de Z");
        double z = scanner.nextDouble();
        // agora que o sistema leu as 3 medidas vamo calcular né bb
        double areaquadrado = (x * y) / 2;
        double areatriangulo = (y * z) / 2;
        double areatrapezio = ((x + y) * z) / 2;
        // agora a saída de dados
        System.out.println("A área do quadrado é: " + areaquadrado);
        System.out.println("A área do triângulo é: " + areatriangulo);
        System.out.println("A área do trapézio é: " + areatrapezio);
        scanner.close();
    }
}
