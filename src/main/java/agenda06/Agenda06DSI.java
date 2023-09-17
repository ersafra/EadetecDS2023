/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package agenda06;

import javax.swing.JOptionPane;

/**
 *
 * @author edson safra 17/09/23
 */
public class Agenda06DSI {

    public static void main(String[] args) {

        int placa;

        placa = Integer.parseInt(JOptionPane.showInputDialog("Qual o final da placa do veículo ?"));

        switch (placa) {
            case 1:
                JOptionPane.showConfirmDialog(null, "Prazo final para pagamento é 30/04");
                break;
            case 2:
                JOptionPane.showConfirmDialog(null, "Prazo final para pagamento é 31/05");
                break;
            case 3:
                JOptionPane.showConfirmDialog(null, "Prazo final para pagamento é 30/06");
                break;
            case 4:
                JOptionPane.showConfirmDialog(null, "Prazo final para pagamento é 31/07");
                break;
            case 5:
                JOptionPane.showConfirmDialog(null, "Prazo final para pagamento é 31/08");
                break;
            case 6:
                JOptionPane.showConfirmDialog(null, "Prazo final para pagamento é 30/09");
                break;
            case 7:
                JOptionPane.showConfirmDialog(null, "Prazo final para pagamento é 31/10");
                break;
            case 8:
                JOptionPane.showConfirmDialog(null, "Prazo final para pagamento é 30/11");
                break;
            case 9:
                JOptionPane.showConfirmDialog(null, "Prazo final para pagamento é 31/12");
                break;
            case 0:
                JOptionPane.showConfirmDialog(null, "Prazo final para pagamento é 31/12");
                break;
        }
    }

}
