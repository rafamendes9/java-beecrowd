package Distancia;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int min,km;
		km = input.nextInt();
		min= (60 * km)/30 ;
		
		System.out.println(min + " minutos");
		
		input.close();

	}

}
