/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ersafra.agenda05;

import javax.swing.JOptionPane;

/**
 *
 * @author edson safra 9/8/23
 */
public class MaiorQueCem {
    
    public static void main(String[] args) {
        //declaraçãp de variavel
        String aux;
        Double numero;
        
        aux = JOptionPane.showInputDialog("Entre com um numero válido");
        numero = Double.parseDouble(aux);
        
        if (numero >= 100) {
            JOptionPane.showMessageDialog(null, "O numero inserido é maior ou igual a 100 ");
            
        } else {
            JOptionPane.showMessageDialog(null, "O numero inserido é menor que 100");
        }
    }
    
}
