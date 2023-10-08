package Agenda09;

public class MediaMercado {
    public static void main(String[] args) {
        double[] precos = {89.99, 120.49, 75.0, 99.99, 149.99, 199.99, 69.99};

//        double media = 0;
//        for(int i = 0;i<precos.length;i++){
//            media = media + precos[i]/precos.length;
//        }
//        System.out.println("A média dos preços é: " + media);

//        double media = 0;
//        for(int i = 0;i<precos.length;i++){
//            media = media + precos[i];
//        }
//        media = media/precos.length;
//        System.out.println("A média dos preços é: " + media);

        double media = 0;
        for(int i = 0;i<precos.length -1;i++){
            media = media + precos[i];
        }
        media = media/(precos.length);
        System.out.println("A média dos preços é: " + media);
    }
}