/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda07;

import javax.swing.JOptionPane;

/**
 *
 * @author edson safra 24/09/2013
 */
public class edsonSafraAg7DSI {

    public static void main(String[] args) {
        //Declaração de variaveis
        String nome;
        int opniao, idade, qtdExcelente, qtdBom, qtdRuim;
        //Iniciando as variaveis que armazena as respostas
        qtdExcelente = 0;
        qtdBom = 0;
        qtdRuim = 0;
        //Inicia o loop com a quantdade de 50 entrevistados
        for (int i = 1; i <= 50; i++) {

            //Entrada de dados "Nome"
            nome = JOptionPane.showInputDialog("Qual o seu nome");
            //Entrada de dados "Idade"
            idade = Integer.parseInt(JOptionPane.showInputDialog("Qual o sua idade"));
            //Enttrada de dados "Avaliação"
            opniao = Integer.parseInt(JOptionPane.showInputDialog("Avalie o nosso atendimento: "
                    + "\n1 - Excelente"
                    + "\n2 - Bom "
                    + "\n3 - Ruim"));
            //Verifica a opnião e acrescenta a variavel
            switch (opniao) {
                case 1:
                    qtdExcelente++;
                    break;
                case 2:
                    qtdBom++;
                    break;
                case 3:
                    qtdRuim++;
                    break;
            }
        }
        //Exibe os resultados
        JOptionPane.showMessageDialog(null, "Resumo das resposta: \nExcelentes : " + qtdExcelente + "\nRuins :" + qtdRuim);
    }
}
