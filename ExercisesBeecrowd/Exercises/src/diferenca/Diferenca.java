package diferenca;

import java.util.Scanner;

public class Diferenca {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Integer a = Integer.valueOf(ler.nextLine());
		Integer b = Integer.valueOf(ler.nextLine());
		Integer c = Integer.valueOf(ler.nextLine());
		Integer d = Integer.valueOf(ler.nextLine());
		Integer dif = Integer.valueOf((a*b)-(c*d));
		System.out.println("DIFERENCA = " + dif);
	}
}
