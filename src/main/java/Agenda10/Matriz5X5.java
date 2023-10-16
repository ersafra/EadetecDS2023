package Agenda10;

import static java.lang.String.format;
import static java.lang.System.out;

import java.util.Scanner;


public class Matriz5X5 {
    public static void main(String[] args) {

        //declaração da classe tipo Scanner para leitura de dados do teclado
        Scanner leitor = new Scanner(System.in);

        //Declaração de variáveis do tipo double para armazenar as notas dos alunos e a média de cada ,sendo 10 alunos e 4 notas por aluno
        double[][] notasAbastecimento = new double[5][5];

        //Declaração de loop do tipo for para percorrer as linhas da matriz
        for (int i = 0; i < notasAbastecimento.length; i++) {

            //Declaração de loop do tipo for para percorrer as colunas da matriz
            for (int j = 0; j < notasAbastecimento[i].length; j++) {

                //Solicitação de dados do teclado para o usuário
                out.println("Digite a valor da nota " + (j + 1) + " do caminhão de nº " + (i + 1));

                //Armazenamento dos dados do teclado na matriz
                notasAbastecimento[i][j] = leitor.nextDouble();
            }//fim laço j
        }//fim do laço i

        //Declaração de variáveis do tipo double para armazenar a média de cada aluno
        double[] mediaAbastecimento = new double[5];

        //Chamada do método para calcular a média de cada aluno, utilizando um laço do tipo for para percorrer as linhas da matriz
        for (int i = 0; i < notasAbastecimento.length; i++) {

            //declaração de variável do tipo double para armazenar a soma das notas de cada aluno
            double soma = 0;

            //Declaração de loop do tipo for para percorrer as colunas da matriz
            for (int j = 0; j < notasAbastecimento[i].length; j++) {

                //Armazenamento da soma das notas de cada aluno
                soma += notasAbastecimento[i][j];

                //formata soma para duas casas decimais
                format("%.2f", soma);


            }//fim do laço j

            //Armazenamento da média de cada aluno
            mediaAbastecimento[i] = soma / notasAbastecimento[i].length;

            //formata a média para duas casas decimais
            format("%.2f", mediaAbastecimento[i]);

            //Imprime a média de cada aluno
            out.println("A média de abastecimento do caminhão " + (i + 1) + " é: " + mediaAbastecimento[i]);


        }//fim do laço i

    }//fim do metodo main


}//fim da classe

