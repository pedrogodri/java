package soma_simples;

import java.util.Scanner;

public class Soma_Simples {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Integer a = Integer.valueOf(ler.nextLine());
		Integer b = Integer.valueOf(ler.nextLine());
		Integer soma = Integer.valueOf(a + b);
		System.out.println("SOMA = " + soma);
	}
}
