package Cedulas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int valor;
	valor = input.nextInt();
	System.out.println(valor);
	System.out.println(valor /100 + " nota(s) de R$ 100,00");
	valor = valor % 100;
	// a % é p modulo ou seja a parte q resta da Divisao e nao o seu Resultado
	System.out.println(valor /50 + " nota(s) de R$ 50,00");
	valor = valor % 50;
	System.out.println(valor /20 + " nota(s) de R$ 20,00");
	valor = valor % 20;
	System.out.println(valor /10 + " nota(s) de R$ 10,00");
	valor = valor % 10;
	System.out.println(valor /5 + " nota(s) de R$ 5,00");
	valor = valor % 5;
	System.out.println(valor /2 + " nota(s) de R$ 2,00");
	valor = valor % 2;
	System.out.println(valor /1 + " nota(s) de R$ 1,00");
	
	// essa questa foi bem interessante pq eu n fazia idea de como fazer e achava q iria usar uma cadeia de IFs
	// mas o video mostra q ir printando o valor e fazer o calculo dentro de cada print seria bem melhor e correto
	input.close();
	}

}
