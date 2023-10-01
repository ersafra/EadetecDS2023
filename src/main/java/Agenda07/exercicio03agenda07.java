/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda07;

import java.util.Scanner;


/**
 *
 * @author edson
 */
public class exercicio03agenda07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double  n1,n2,media;
        n1 = 0;
        n2 = 0;
        int contador;
        for(int i=0;i<=30;i++){
        System.out.println("Informe a primeira nota " + i);
        n1 = ler.nextDouble();
        System.out.println("Informe a segunda nota " + i);
        n2 = ler.nextDouble();
        media = (n1+n2)/2;
           if(media >= 7.0){              
        System.out.println("Sua situação é : Aprovada  " + media);
    }else{System.out.println("Sua situação é : Reprovada  " + media);}
   
}
    }
    }
