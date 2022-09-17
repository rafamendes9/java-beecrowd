package Consumo;

import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int X;
		double Y, Km;
		X = input.nextInt();
		;
		Y = input.nextDouble();
		Km = X / Y;
		System.out.printf("%.3f km/l%n", Km);

		input.close();

	}

}