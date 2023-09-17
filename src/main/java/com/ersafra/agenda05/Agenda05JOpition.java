package com.ersafra.agenda05;

import javax.swing.JOptionPane;

/**
 *
 * @author edson safra 9/8/23
 */
public class Agenda05JOpition {

    public static void main(String[] args) {
        // usando JOpition
        String aux;
        String nome;
        int idade;

        nome = JOptionPane.showInputDialog("Entre com o nome do usuario");
        aux = JOptionPane.showInputDialog("Entre com a idade do usuario");
        idade = Integer.parseInt(aux);

        if (idade > 60) {
            if (idade >= 80) {
                JOptionPane.showMessageDialog(null, "Encaminhe o Sr.(a) " + nome + " para a fila 80+");
            } else {
                JOptionPane.showMessageDialog(null, "Encaminhe o Sr.(a) " + nome + " para a fila prioritária");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Encaminhe o Sr.(a) " + nome + " para fila comum");
        }

    }

}
