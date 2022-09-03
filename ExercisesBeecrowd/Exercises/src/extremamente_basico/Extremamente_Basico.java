package extremamente_basico;

import java.util.Scanner;

public class Extremamente_Basico {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Integer a = Integer.valueOf(ler.nextLine());
		Integer b = Integer.valueOf(ler.nextLine());
		Integer soma = Integer.valueOf(a+b);
		System.out.println("X = " + soma);
	}

}
