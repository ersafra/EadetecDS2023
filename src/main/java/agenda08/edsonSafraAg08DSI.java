package agenda08;

import static java.lang.System.out;

import java.util.Scanner;

public class edsonSafraAg08DSI {
    public static void main(String[] args) {
        //define uma varial do tipo texto (String) para receber o nome do usuario.
        String Usuario;

        //define as variavel do tipo inteiro (int) e atribui o valor 0 para que seja inicializada pelo sistema.
        int cadeiras = 0, idade = 0;
        int Otimo = 0, Bom = 0, Regular = 0, Ruim = 0, Pessimo = 0;
        int qtdOtima = 0, qtdBom = 0, qtdRegular = 0, qtdRuim = 0, qtdPessima = 0;
        int iddOtima = 0, iddBom = 0, iddRegular = 0, iddRuim = 0, iddPessima = 0;

        //define uma variavel do tipo caracter (char) para receber a nota do usuario.
        char nota;
        //Leitura de dados do teclado, atraves da classe Scanner.
        Scanner scan = new Scanner(System.in);
        //Inicio do laço de repetição while, que irá se repetir enquanto a condição for verdadeira.
        do {
           //entrada de dados do usuario.atraves da classe Scanner.
            out.println("Digite seu nome: ");
            Usuario = scan.next();
            //entrada de dados do usuario.atraves da classe Scanner.
            out.println("Digite sua idade: ");
            idade = scan.nextInt();
            out.println("Qual a sua avalição do nosso cinema , sendo : \nA-Otimo\nB-Bom\nC-Regular\nD-Ruim\nE-Pessimo: ");
           // Leitura de dados do usuario, atraves da classe Scanner, e armazenado a primeira letra da palavra digitada com o metodo next().charAt(0).
            nota = scan.next().charAt(0);
            if (nota == 'A') {
                qtdOtima++;
                iddOtima += idade;
            } else if (nota == 'B') {
                qtdRuim++;
                iddRuim += idade;
            } else if (nota == 'C') {
                qtdPessima++;
                iddPessima += idade;
            } else if (nota == 'D') {
                qtdBom++;
                iddBom += idade;
            } else if (nota == 'E') {
                qtdRegular++;
                iddRegular += idade;
            } else {
                out.println("Nota inválida!");

            }
            cadeiras++;
        }

        while (cadeiras <= 5);



        //Calculo da média de idade dos clientes que avaliaram o cinema

        double mediaOtima = (double) iddOtima / qtdOtima;
        double mediaBom = (double) iddBom / qtdBom;
        double mediaRegular = (double) iddRegular / qtdRegular;
        double mediaRuim = (double) iddRuim / qtdRuim;
        double mediaPessima = (double) iddPessima / qtdPessima;

        //Calculo da porcentagem de pessoas que avaliaram o cinema como péssimo.
        double porcentagemPessimo = (double) qtdPessima / cadeiras * 100;

        //Exibe os resultados para o entrevistador. codigo comentado pois não foi pedido no exercicio.
        out.println("A quantidade de pessoas que avaliaram o cinema como ótimo foi: " + qtdOtima);
        //out.println("A média de idade das pessoas que avaliaram o cinema como ótimo foi: " + mediaOtima);
        //out.println("A quantidade de pessoas que avaliaram o cinema como ruim foi: " + qtdRuim);
        out.println("A média de idade das pessoas que avaliaram o cinema como ruim foi: " + mediaRuim);
        //out.println("A quantidade de pessoas que avaliaram o cinema como péssimo foi: " + qtdPessima);
        //out.println("A média de idade das pessoas que avaliaram o cinema como péssimo foi: " + mediaPessima);
        out.println("A porcentagem de pessoas que avaliaram o cinema como péssimo foi: " + porcentagemPessimo + " %");
    }


}



