/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ersafra.agenda05;

import java.sql.DriverManager;
import java.util.Scanner;

/**
 *
 * @author edson
 */
public class IFComposto {
    public static void main(String[] args) {
        //declaração de variaveis
        int idade; // armazena a idade
        Scanner scan = new Scanner(System.in);
        //entrada de dados
        System.out.println("Entre com a sua idade");
        idade = scan.nextInt();
        
        //Decisão
        
        if(idade >=18){
        //comando se acondição for verdadeira
            System.out.println("Maior de idade");
        } else {
        //comando de a condição for falsa
            System.err.println("Menor de idade");}
        
    }// fim do if/else
}// fim da classe
