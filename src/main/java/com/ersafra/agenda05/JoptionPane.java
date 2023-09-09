
package com.ersafra.agenda05;

/**
 *
 * @author edson safra 8/9/23
 */

import javax.swing.JOptionPane;

public class JoptionPane {
    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog(null,"Entre com um nome");
        //saida de dados
        JOptionPane.showMessageDialog(null,"O seu nome é "+nome);
    }
}
    
