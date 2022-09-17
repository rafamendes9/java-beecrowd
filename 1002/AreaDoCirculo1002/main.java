package AreaDoCirculo1002;

import java.util.Locale;
import java.util.Scanner;
//A fórmula para calcular a área de uma circunferência é: area = pi . raio2.
//Considerando para este problema que π = 3.14159:

//Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

//A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

//Saída
//Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo,
//com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
// locale usado pra trocar a localizaçao pro EUA (no formato de texto do codigo) 
//para usar o ponto e virgula dos de forma correta no codigo e n ter dor de cabeça 	

		double pi = 3.14159, area, raio;
		// math.pow( A, B) é usado pra caulcular o quadrado onde A é RAIO e B é o
		// Quadrado (o q fica elevado)

		raio = input.nextDouble();
		area = pi * Math.pow(raio, 2);
// o calculo tem q ficar embaixo do input ( estava tentando colocar junto com os doubles e ficava dando erro)		

		System.out.printf("A=%.4f%n", area);
// printf usado pra imprimir algo "formatado" printado da forma de N numeros dps da casa decimal
// %.4f o % é dentro da string esta reservando um espaço, 4 é de 4 casas decimais e F é de format		
//%n ou /n usado pra dar a quebra de lina como se fosse println		
		input.close();
	}

}
