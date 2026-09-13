import domain2.Pessoa;

public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 25;
        pessoa1.cpf = "123.456.789-00";

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Alexander";
        pessoa2.idade = 19;
        pessoa2.cpf = "987.654.321.00";
    }
}
