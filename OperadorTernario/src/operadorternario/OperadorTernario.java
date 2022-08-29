package operadorternario;

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n1, n2, maior, r;
        n1 = ler.nextInt();
        n2 = ler.nextInt();
        maior = n1>n2 ? n1:n2;
        r = n1>n2 ? n1+n2: n1-n2;
        System.out.println("\n" + maior);
        System.out.println("\n" + r);
    }
    
}
