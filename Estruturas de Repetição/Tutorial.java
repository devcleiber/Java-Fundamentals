public class Tutorial {
    public static void main(String[] args) {

        // Um gabarito com as sintaxes para uma revisõa rápida caso seja esquecido
        // algo!!

        // Estrutura While (Enquanto)

        // while (condição){
        // bloco de comando
        // }

        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
            // A estrutura while é mais utilizada quando não se sabe o número de repetições,
            // enquanto o for é mais utilizado quando se sabe o número de repetições
            // faz com que se repita um número de 0 a 10, caso queira que se repita de 0 a
            // 100, basta mudar o valor da condição para i <= 100
        }

        // Estrutura Do-While (Faça-Enquanto)

        // do {
        // bloco de comando
        // } while (condição);

        int j = 0;
        do {
            System.out.println("Executando o Do-While: " + j);
            j++;
            // A estrutura do-while é mais utilizada quando se quer que o bloco de comando
            // seja executado pelo menos uma vez, mesmo que a condição seja falsa
            // faz com que se repita um número de 0 a 10, caso queira que se repita de 0 a
            // 100, basta mudar o valor da condição para j <= 100
        } while (j <= 10);

        // Estrutura For (Para)
        // for (inicialização; condição; incremento){
        // bloco de comando
        // }

        for (int k = 0; k <= 10; k++) {
            System.out.println("Executando o For: " + k);
            // a estrutura for é mais utilizada quando se sabe o número de repetições,
            // enquanto o while e do-while são mais utilizados quando não se sabe o número
            // de repetições
            // faz com que se repita um número de 0 a 10, caso queira que se repita de 0 a
            // 100, basta mudar o valor da condição para k <= 100
        }
    }
}
