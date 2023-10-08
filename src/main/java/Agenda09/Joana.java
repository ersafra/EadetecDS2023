package Agenda09;

public class Joana {
    public static void main(String[] args) {
        int[] numeros = {5, 12, 18, 7, 24, 36, 42};
        int posicao = 10;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] == 24){
                posicao = i;
                break;
            }
        }
        System.out.println("O número 24 está na posição: " + posicao);
    }
}