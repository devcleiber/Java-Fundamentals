package SistemaFuncionario.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double [] salario;

    //imprime dados
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Salário: ");
        for (double salario : this.salario) {
            System.out.println(salario + " ");
        }
        imprimirmedia();
    }
    //calcula media salario
    public void imprimirmedia(){
        double soma = 0;
        for (double salario : this.salario) {
            soma += salario;
        }
        double media = soma / this.salario.length;
        System.out.println("Média salarial: " + media);
    }

}
