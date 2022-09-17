package Salario;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int NumFunc, HrTrab;
		double ValorHr, Salario;
		NumFunc = input.nextInt();
		HrTrab = input.nextInt();
		ValorHr = input.nextDouble();
		Salario = HrTrab * ValorHr;

		System.out.println("NUMBER = " + NumFunc);
		System.out.printf("SALARY = U$ %.2f%n", Salario);
		input.close();
	}

}
