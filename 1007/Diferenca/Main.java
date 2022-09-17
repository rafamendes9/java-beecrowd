package Diferenca;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A,B,C,D,DIFERENCA;
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();
		 DIFERENCA = (A * B - C * D);
		 //formula de diferença entre valores de uma variavel
		System.out.println("DIFERENCA = " +  DIFERENCA);
		
		
		input.close();
		
	}

}
