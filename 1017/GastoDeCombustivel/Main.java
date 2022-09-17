package GastoDeCombustivel;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int tempo,KmH;
		double x,KmL=12;
		tempo = input.nextInt();
		KmH = input.nextInt();
		
		x =(tempo*KmH);
		x = x/KmL ;
		System.out.printf("%.3f%n", x);
		
		
		
		input.close();

	}

}
