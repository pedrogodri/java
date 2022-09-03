package media_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media_2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double a = Double.valueOf(ler.nextLine());
		Double b = Double.valueOf(ler.nextLine());
		Double c = Double.valueOf(ler.nextLine());
		Double media = Double.valueOf(((a*2)+(b*3)+(c*5))/10);
		DecimalFormat df = new DecimalFormat("0.#");
		String mediaF = df.format(media);
		System.out.println("MEDIA = " + mediaF);
	}
}
