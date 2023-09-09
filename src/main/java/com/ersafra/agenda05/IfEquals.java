/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ersafra.agenda05;

import javax.swing.JOptionPane;

/**
 *
 * @author edson
 */
public class IfEquals {
    public static void main(String[] args) {
        //declaração de variaveis
        String nome;
        
        //entrada de dados
        nome = JOptionPane.showInputDialog("Entre com seu nome");
        
        //Processamento e saida
        if(nome.equals("Edson")){
            JOptionPane.showMessageDialog(null,"O nome digitado esta correto");
        }else{
            JOptionPane.showMessageDialog(null,"O nome digita esta errado , vc digitou "+nome+"!!");
        }
    }
   
}
