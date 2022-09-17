package CalculoSimples;

import java.util.Scanner;

public class Main {
// fiz esse full solo sem video haahahahahaha
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int c1,n1,c2,n2;
double v1,v2,total;
c1 = input.nextInt();
n1  = input.nextInt();
v1 = input.nextDouble();
c2 = input.nextInt();
n2 = input.nextInt();
v2 = input.nextDouble();

total=((v1*n1)+(v2*n2));

System.out.printf("VALOR A PAGAR: R$ %.2f%n",total);
input.close();
	}

}
