package agenda08;

public class Repeticao {
    public static void main(String[] args) {
        //exercicio de repetiçaõ de um numero ate 50
        //declaração de duas variaveis do tipo inteiro na mesma linha com atribuição de valor e inicialização.
        int num , contador =0;
        //declaração de uma variavel do tipo double(ou numero fracionado) e atribuição de valor e inicialização.
        double media =0;
        //inicio da repeticao usando do/while
        do{
            //Entrada de dados do usuario usando a classe JOptionPane
            num = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Entre com  um numero: "));
            //soma dos numeros digitados pelo usuario.
            media = media + num;
            //incremento do contador, para contabilisar a quantidade de vezes que o usuario digitou um numero.
            contador++;
    }while (contador<50);//fim da repetição
        //calculando da media dos numeros digitados pelo usuario.
        media = media/contador;
        //saida de dados para o usuario usando a classe JOptionPane
        javax.swing.JOptionPane.showMessageDialog(null,"A media dos numeros digitados é: "+media);
    }//fim do metodo main
}//fim da classe Repeticao
