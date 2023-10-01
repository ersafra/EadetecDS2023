package agenda08;

import java.util.Scanner;

public class Exercicio06While {
    public static void main(String[] args) {
        //inicianlizando as variavel, sendo  x do tipo inteiro(int) e definindo o valor 2
        int x = 2, num, maior, comprara;

        Scanner entrada = new Scanner(System.in);//criando um objeto do tipo Scanner para captura de dados forncedidos pelo usuario.

        System.out.println("Digite quantos numeros você quer comparar: ");//imprimindo na tela a mensagem para o usuario digitar um numero inteiro.

        comprara = entrada.nextInt();//capturando o numero digitado pelo usuario e armazenando na variavel comprara.

        System.out.println("Insira o primeiro numero: ");//imprimindo na tela a mensagem para o usuario digitar um numero inteiro.

        maior = entrada.nextInt();//capturando o numero digitado pelo usuario e armazenando na variavel maior.

        while (x <= comprara) {//enquanto x for menor ou igual a comprara, o bloco de codigo abaixo sera executado.

            System.out.println("Digite " + x + " numeros ");//imprimindo na tela a mensagem para o usuario digitar um numero inteiro.

            num = entrada.nextInt();//capturando o numero digitado pelo usuario e armazenando na variavel num.

            if (num > maior) {//se o valor da variavel num for maior que o valor da variavel maior, o bloco de codigo abaixo sera executado.

                maior = num;//atribuindo o valor da variavel num a variavel maior.
            }
            x++;//incrementando o valor da variavel x.
        }
        System.out.println("O maior numero é: " + maior);//imprimindo na tela a mensagem com o maior numero.


    }
}
