/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda06;

import javax.swing.JOptionPane;

/**
 *
 * @author edson safra 17/09/2023
 */
public class Switch_ex2 {
    public static void main(String[] args) {
        int opcao;
        
        opcao = Integer.parseInt( JOptionPane.showInputDialog("Entre com a opção desejada:"+
                "\n1 - Cadastrar Novo Usuário"+
                "\n2 - Alterar Usuário"+
                ""));
        
        switch (opcao) {
            case 1:
                JOptionPane.showConfirmDialog(null, "Cadastrando Usuário");
                break;
                case 2:
                JOptionPane.showConfirmDialog(null, "Alterando Dados do Usuário");
                break;
                case 3:
                JOptionPane.showConfirmDialog(null, "Excluindo Dados do Usuário");
                break;
            default:
                throw new AssertionError();
        }
        
    }
}
