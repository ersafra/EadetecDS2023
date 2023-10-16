package Agenda10;

public class ExemploMatriz5x5 {
    public static void main(String[] args) {
        //Declaração de variáveis do tipo double para definir o tamanho da matriz
        double[][] num = new double[4][4];
        //Declaração de variáveis do tipo int para armazenar valores em linhas e colunas
        int linha, coluna;
        //Declaração de variável do tipo String para armazenar os valores da matriz
        String exibir = "";
        //Instancio a classe JOptionPane para entrada de dados
        JOptionPane.showMessageDialog(null, "Inserindo os dados da Matriz");
        //Declaração de loop do tipo for para percorrer as linhas da matriz
        for (linha = 0; linha < 4; linha++) {
            //Declaração de loop do tipo for para percorrer as colunas da matriz
            for (coluna = 0; coluna < 4; coluna++) {
                num[linha][coluna]
                        //Conversão de String para double
                        = Double.parseDouble(
                        //Instancio a classe JOptionPane para exibição de dados
                        JOptionPane.showInputDialog("Entre com o número " + "\nlinha " + "" + linha + "\nColuna " + coluna));
            }//fim do laço for coluna
        }//fim do laço for linha
        //Mostrando os dados da matriz,instanciando a classe JOptionPane para saída de dados
        JOptionPane.showMessageDialog(null, "Mostrando  os dados da Matriz");
        //Declaração de loop do tipo for para percorrer as linhas da matriz
        for (linha = 0; linha < 4; linha++) {
            //Declaração de loop do tipo for para percorrer as colunas da matriz
            for (coluna = 0; coluna < 4; coluna++) {
                //Concatenação dos valores da matriz
                exibir += num[linha][coluna] + "|";
            }//fim do laço for coluna
            exibir += "\n";
        }//fim do laço for linha
        //Instancio a classe JOptionPane para exibição de dados
        JOptionPane.showMessageDialog(null, exibir);
    }//fim do método main
}//fim da classe ExemploMatriz
