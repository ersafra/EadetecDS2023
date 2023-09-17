/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda06;

import javax.swing.JOptionPane;

/**
 *
 * @author edson safra
 */
public class Switch_ex1 {

    public static void main(String[] args) {
        //declara as variaveis
        int opcao;
        //entrada e conversao de dados
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do produto"));
        //Processamento de dados
        switch (opcao) {
            case 100:
                JOptionPane.showMessageDialog(null, "O produto selecionado é lápis preto n.2");
                break;
            case 150:
                JOptionPane.showMessageDialog(null, "O produto selecionado é Borracha Branca");
                break;
            case 200:
                JOptionPane.showMessageDialog(null, "O produto selecionado é Caneta Azul");
                break;
            case 230:
                JOptionPane.showMessageDialog(null, "O produto selecionado é Caneta Vermelha");
                break;
            case 256:
                JOptionPane.showMessageDialog(null, "O produto selecionado é Giz de Cera 12 unid.");
                break;
            case 300:
                JOptionPane.showMessageDialog(null, "O produto selecionado é Cartolina Branca ");
                break;
            case 310:
                JOptionPane.showMessageDialog(null, "O produto selecionado é Resma de sulfite A4");
                break;
            case 400:
                JOptionPane.showMessageDialog(null, "O produto selecionado é estojo escolar verde ");
                break;
            case 470:
                JOptionPane.showMessageDialog(null, "O produto selecionado é caderno universitario 100 fls.");
                break;
            case 500:
                JOptionPane.showMessageDialog(null, "O produto selecionado é caderno brochura 50 fls.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Produto não cadastrado");
                break;
        }
    }
}
