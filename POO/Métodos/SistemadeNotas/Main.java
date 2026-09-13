package SistemadeNotas;

import domain.MediaAluno;

public class Main {
    public static void main(String[] args) {
        MediaAluno Alunotest = new MediaAluno();
        Alunotest.setNome("Cleiber");
        double media = Alunotest.calcularMedia(8.5, 7.0, 9.0);
        System.out.println("Média do aluno: " + media);

    }
}
