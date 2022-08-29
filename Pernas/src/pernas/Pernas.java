package pernas;

import java.util.Scanner;

public class Pernas {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        System.out.println("Quantas Pernas?");
        int perna = ler.nextInt();
        String tipo;
        System.out.println("Isso é um(a) ");
        switch (perna){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
            case 4: 
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;
        }
        System.out.println(tipo);
    }
    
}
