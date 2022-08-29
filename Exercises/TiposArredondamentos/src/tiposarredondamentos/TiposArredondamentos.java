package tiposarredondamentos;

import java.util.Scanner;

public class TiposArredondamentos {

    public static void main(String[] args) {
        float v;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        v = ler.nextFloat();
        int v1 = (int) Math.floor(v);
        int v2 = (int) Math.ceil(v);
        int v3 = (int) Math.round(v);
        System.out.println("FLOOR = " + v1);
        System.out.println("CEIL = " + v2);
        System.out.println("ROUND = " + v3);
        
        double aleR;
        aleR = Math.random();
        System.out.println("NUMERO ALEATORIO REAL = " + aleR);
        double ale;
        ale = (1 + Math.random() * (100 - 1));
        System.out.printf("NUMERO ALEATORIO ENTRE 1-100 = %.2f\n", ale);
        int aleN;
        aleN = (int) (1 + Math.random() * (10 - 1));
        System.out.println("NUMERO ALEATORIO NATURAL = " + aleN);
    }
    
}