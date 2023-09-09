/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ersafra.agenda05;

import javax.swing.JOptionPane;

/**
 *
 * @author edson safra 8/9/23
 */
public class JoptionPaneCast {
    public static void main(String[] args) {
        //declaração de variavies
        String auxiliar;
        int numeroInteiro;
        double numeroDouble;
        float numeroFloat; 
        
        // entrada de dados salvando na variavel auxiliar (String)
        auxiliar = JOptionPane.showInputDialog("Entre com um numero Inteiro");
        
        //convertendo do tipo string para inteiro(int) - Integer.parseInt
        numeroInteiro = Integer.parseInt(auxiliar);
        numeroDouble = Double.parseDouble(auxiliar);
        numeroFloat = Float.parseFloat(auxiliar);
        
        //mensagem de saida
        JOptionPane.showMessageDialog(null,"O número inteiro é "+numeroInteiro+"\n");
        JOptionPane.showMessageDialog(null,"O número double é "+numeroDouble+"\n");
        JOptionPane.showMessageDialog(null,"O número float é "+numeroFloat);
    }
    
}
