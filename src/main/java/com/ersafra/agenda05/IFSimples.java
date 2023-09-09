/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ersafra.agenda05;

import java.util.Scanner;

/**
 *
 * @author edson
 */
public class IFSimples {

    public static void main(String[] args) {

        int idade;
        Scanner scan = new Scanner(System.in);

        //entrada de dados
        System.out.println("Entre com seu idade");

        idade = scan.nextInt();

        //decisão
        if (idade >= 18) {
            System.out.println("Voce é maior de idade");
        }// fim do if

    }//fim do main

}//fim da classe
