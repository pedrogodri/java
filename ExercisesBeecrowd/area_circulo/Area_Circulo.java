package area_circulo;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Area_Circulo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double raio = Double.valueOf(ler.nextLine());
		double pi = 3.14159;
		Double area = Double.valueOf(pi * Math.pow(raio, 2));
		DecimalFormat df = new DecimalFormat("0.####");
		String areaF = df.format(area);
		System.out.println("A = " + areaF);
	}

}
