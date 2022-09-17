package ConversaoDeTempo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tempo;
		tempo = input.nextInt();
		System.out.print(tempo /60+":");
		tempo=tempo%60;
		System.out.print(tempo /60+":");
		tempo=tempo%60;
		System.out.print(tempo /60);
		tempo=tempo%60;
		input.close();
	
	}

}
