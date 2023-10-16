package Agenda10;

import javax.swing.JOptionPane;

public class MatrizInicializada {
    public static void main(String[] args) {
        //Matriz 2x2 inicializada
        int matriz[][] = {{1, 2}, {3, 4}};
        //Imprime a matriz , imprime os valores da matriz
        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++) {
                JOptionPane.showMessageDialog(null, "Matriz [" + linha + "] Coluna [" + coluna + "] = " + mat[linha][coluna]);
            }//fim do laço for coluna


        }//fim do laço for linha

    }//fim do método main

}//fim da classe MatrizInicializada
