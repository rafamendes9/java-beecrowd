package Media2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double A, B, C, MEDIA;
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		MEDIA = ((A * 2) + (B * 3) + (C * 5)) / 10.0;
		// formula de media entre valores de variaveis
		System.out.printf("MEDIA = %1f%n", MEDIA);

		input.close();

	}

}
