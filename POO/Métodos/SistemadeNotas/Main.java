package SistemadeNotas;

import domain.MediaAluno;

public class Main {
    public static void main(String[] args) {
        MediaAluno Alunotest = new MediaAluno();
        Alunotest.setNome("Cleiber"); //exibe nome do aluno
        double media = Alunotest.calcularMedia(8.5, 7.0, 9.0); //calcula a média das notas
        Alunotest.exibirMedia(media); //exibe a média do aluno
        Alunotest.exibirsituacao(media); //exibe a situação do aluno (aprovado ou reprovado)
        
        
    }
}
