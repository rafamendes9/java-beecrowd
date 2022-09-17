package DistanciaEntreDoisPontos;

import java.util.Scanner;
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		double x1, x2, y1, y2, xy;
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		xy = Math.sqrt(Math.pow(x2- x1,2) + Math.pow(y2- y1,2));

		// math.sqrt usado para Raiz

		System.out.printf("%.4f%n", xy);
		input.close();

	}

}