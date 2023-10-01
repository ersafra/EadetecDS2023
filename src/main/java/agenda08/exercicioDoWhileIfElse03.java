package agenda08;

import static java.lang.System.out;

import java.util.Scanner;


public class exercicioDoWhileIfElse03 {
    public static void main(String[] args) {
        String nome, cargo;
        float salario, emprestimo;

        out.println("Por favor , informe se nome: ");
        nome = new Scanner(System.in).nextLine();
        out.println("E agora informe qual é o seu cargo(Diretor, Gerente ou Operacional");
        cargo = new Scanner(System.in).nextLine();

        while (!cargo.equalsIgnoreCase("Operacional") && !cargo.equalsIgnoreCase("Diretor") && !cargo.equalsIgnoreCase("Gerente")) {
            out.println("Cargo incorreto, por favor informe o cargo novamente: ");
            cargo = new Scanner(System.in).nextLine();
        }

        out.println("Agora informe o seu salario: ");
        salario = new Scanner(System.in).nextFloat();
        if (cargo.equals("Gerente")) {
            emprestimo = salario * 25 / 100;
        } else if (cargo.equals("Diretor")) {
            emprestimo = salario * 30 / 100;
        } else {
            emprestimo = salario * 20 / 100;
        }
        out.println("Olá " + nome);
        out.println("Seu cargo atual é:" + cargo);
        out.println("Seu salário atual é:" + salario);
        out.println("Olá " + nome);
        out.println("E voc~e tem direito a pegar R$:" + emprestimo + " de emprestimo");
    }
}

