/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.ersafra.agenda05;

import java.util.Scanner;

/**
 *
 * @author edson safra 08/09/2023
 */
public class Agenda05 {

    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do segurado");
        nome = scan.nextLine();
        System.out.println("Digite a idade do segurado");
        idade = scan.nextInt();
        if (idade > 60) {
            if (idade >= 80) {
                System.out.println("Encaminhe o Sr.(a)" + nome + " para a fila 80+");
            } else {
                System.out.println("Encaminhe o Sr.(a)" + nome + " a fila prioritária");
            }
        } else {
            System.out.println("Encaminhe o Sr.(a)" + nome + " para fila comum");
        }

    }
}
