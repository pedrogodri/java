package media_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Media_1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Double a = Double.valueOf(ler.nextLine());
		Double b = Double.valueOf(ler.nextLine());
		Double media = Double.valueOf(((a*3.5)+(b*7.5))/11);
		DecimalFormat df = new DecimalFormat("0.#####");
		String mediaF = df.format(media);
		System.out.println("MEDIA = " + mediaF);
	}

}
