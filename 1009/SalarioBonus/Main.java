package SalarioBonus;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String NomeFuncionario;
		double salario,vendas,comissao, SalarioFinal;
		NomeFuncionario = input.next();
		salario = input.nextDouble();
		vendas = input.nextDouble();
		comissao = vendas * 0.15;
		SalarioFinal = comissao + salario;
		System.out.printf("TOTAL = R$ %.2f%n", SalarioFinal);
		
		input.close();
	}

}
