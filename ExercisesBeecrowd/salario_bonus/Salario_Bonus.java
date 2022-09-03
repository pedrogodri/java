package salario_bonus;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Salario_Bonus {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome = String.valueOf(ler.nextLine());
		Double salario = Double.valueOf(ler.nextLine());
		Double vendas = Double.valueOf(ler.nextLine());
		Double bonus = ((vendas * 0.15) + salario);
		DecimalFormat df = new DecimalFormat("0.##");
		String b = df.format(bonus);
		System.out.println("TOTAL = " + b);
	}
}
