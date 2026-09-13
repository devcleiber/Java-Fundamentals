package SistemadeNotas.domain;

public class MediaAluno {
    public void setNome(String nome) {
        System.out.println("Nome do aluno: " + nome);
    }

    public double calcularMedia(double nota1, double nota2, double nota3) {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void exibirMedia(double media) {
        System.out.println("Média do aluno: " + media);
    }

    public void exibirSituacao(double media) {
        if (media >= 7.0) {
            System.out.println("Situação: Aprovado");
        } else if (media >= 5.0) {
            System.out.println("Situação: Em Recuperação");
        } else {
            System.out.println("Situação: Reprovado");
        }
    }
}
