package Esfera;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double pi = 3.14159,R,volumeEsfera;
		R = input.nextDouble();

		volumeEsfera = (4/3.0) * pi * Math.pow(R, 3);

		System.out.printf("VOLUME = %.3f%n", volumeEsfera);

		input.close();
	}

}
