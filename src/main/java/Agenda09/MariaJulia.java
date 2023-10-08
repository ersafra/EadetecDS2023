package Agenda09;

import java.util.Scanner;

public class MariaJulia {
    public static void main(String[] args) {

        String[] nomes = new String[5];

        double[] notas = new double[5];

        Scanner scan = new Scanner(System.in);

        for (int cont = 0; cont <= 4; cont++) {
            System.out.println("Digite o nome: " + (cont + 1));
            nomes[cont] = scan.nextLine();
            System.out.println("Digite a nota do aluno: " + (cont + 1));
            notas[cont] = Double.parseDouble(scan.nextLine());
        }
        double soma = 0;
        for (int i = 0; i < 5; i++) {
            soma += notas[i];
        }
        double media = (soma / 5);
        System.out.println("A média é: " + media);

        for (int i = 0; i < 5; i++){
            if (notas[i] >= media) {
                System.out.println("O aluno " + nomes[i] + " está acima da média");
            } else {
                System.out.println("O aluno " + nomes[i] + " está abaixo da média");
            }
        }
    }
}
