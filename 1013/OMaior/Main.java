package OMaior;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A, B, C, Maior,MaiorC;
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		Maior = (A + B + Math.abs(A - B)) / 2;
		MaiorC =(Maior +C+Math.abs(Maior - C))/2 ;
		System.out.println(MaiorC + " eh o maior");

		input.close();
	}

}
