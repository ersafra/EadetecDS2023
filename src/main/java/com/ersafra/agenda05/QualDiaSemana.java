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
public class QualDiaSemana {

    public static void main(String[] args) {

        //declaração de variaveis
        int dia; // variavel que vai armazenar o dia da semana
        //entrada de dados já fazendo a conversão de tipos
        dia = Integer.parseInt(JOptionPane.showInputDialog("Entre com o dia de 1 a 7"));
//processamento
        if (dia == 1) {//if segunda
            JOptionPane.showMessageDialog(null, "Voçê escolheu Domingo");
        } else {
            if (dia == 2) {
                JOptionPane.showMessageDialog(null, "Voçê escolheu Segunda");
            } else {
                if (dia == 3) {
                    JOptionPane.showMessageDialog(null, "Voçê escolheu Terça");
                } else {
                    if (dia == 4) {
                        JOptionPane.showMessageDialog(null, "Voçê escolheu Quarta");
                    } else {
                        if (dia == 5) {
                            JOptionPane.showMessageDialog(null, "Voçê escolheu Quinta");
                        } else {
                            if (dia == 6) {
                                JOptionPane.showMessageDialog(null, "Voçê escolheu Sexta");
                            } else {
                                if (dia == 7) {
                                    JOptionPane.showMessageDialog(null, "Voçê escolheu Sabado");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Dia Inválido");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
