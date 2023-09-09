/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ersafra.agenda05;

import java.util.Scanner;

/**
 *
 * @author edson safra
 */
public class IFAninhado {

    public static void main(String[] args) {
        //declaração de variaveis
        int idade; // armazena a idade
        Scanner scan = new Scanner(System.in);
        //entrdade dados
        System.out.println("entre com a sua idade");
        idade = scan.nextInt();

        //Decisão
        if (idade > 18) {//primeiro if
            //comandos se a condiçaõ for verdadeira
            if (idade == 18) {//segundo if
                System.out.println("igual a 18");
            } else {
                System.out.println("Maior de 18");
            }//fim do segundo if
        } else {
            //comando se a consição for falsa
            System.out.println("Menor de Idade");
        }// fim do primeiro if

    }// fim do main

}// fim da classe
