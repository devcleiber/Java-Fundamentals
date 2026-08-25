import java.util.Scanner;

public class TrocoVerificado {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o preço do produto:");
    double PrecoProduto = sc.nextDouble();
    System.out.println("Digite a quantidade comprada:");
    double quantia = sc.nextDouble();
    System.out.println("Digite o Valor Recebido:");
    double recebido = sc.nextDouble();
    
    double ValorTotal = PrecoProduto * quantia;
    double troco = recebido - ValorTotal;
    
    if (recebido < ValorTotal){
      System.out.println("Valor Recebido é insuficiente!");
    } else{
      System.out.println("O Troco é de:" + troco);
      }
    sc.close();
  }
}
