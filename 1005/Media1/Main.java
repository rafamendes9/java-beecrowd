package Media1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double A, B, MEDIA;
		A = input.nextDouble();
		B = input.nextDouble();
		MEDIA = ((A * 3.5) + (B * 7.5))/11.0;
		System.out.printf("MEDIA = %.5f%n", MEDIA);
		input.close();

	}

}
