package Agenda10;

public class Matriz4x4 {
    public static void main(String[] args) {
        //Declaração de variáveis do tipo double para definir o tamanho da matriz
        double[][] num = new double[4][4];
        //Declaração de variáveis do tipo int para armazenar valores em linhas e colunas
        int linha, coluna;
        //Inserindo dados na matriz, usando a classe JOptionPane para entrada de dados
        JOptionPane.showMessageDialog(null, "Inserindo os dados da Matriz");
        //Declaração de loop do tipo for para percorrer as linhas da matriz
        for (linha = 0; linha < 4; linha++) {
            //Declaração de loop do tipo for para percorrer as colunas da matriz
            for (coluna = 0; coluna < 4; coluna++) {
                num[linha][coluna] = Double.parseDouble(JOptionPane.showInputDialog("Entre com o número " + "\nlinha " + "" + linha + "\nColuna " + coluna));
            }//fim do laço for coluna
        }//fim do laço for linha
        //Mostrando os dados da matriz,usando a classe JOptionPane para saída de dados
        JOptionPane.showMessageDialog(null, "Mostrando  os dados da Matriz");
        //Declaração de loop do tipo for para percorrer as linhas da matriz
        for (linha = 0; linha < 4; linha++) {
            //Declaração de loop do tipo for para percorrer as colunas da matriz
            for (coluna = 0; coluna < 4; coluna++) {
                JOptionPane.showMessageDialog(null, "Linha" + linha + "\nColuna " + coluna + "\nNúmero " + num[linha][coluna]);
            }//fim do laço for coluna
        }//fim do laço for linha
    }  //fim do método main
}//fim da classe Matriz4x4
