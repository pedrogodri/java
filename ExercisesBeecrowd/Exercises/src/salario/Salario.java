package salario;

import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Integer numF = Integer.valueOf(ler.nextLine());
		Integer h = Integer.valueOf(ler.nextLine());
		Float valorH = Float.valueOf(ler.nextLine());
		Float salario = Float.valueOf(valorH * h);
		System.out.println("NUMBER = " + numF + "\n" + "SALARY = U$ " + salario);
	}
}
