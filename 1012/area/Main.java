package area;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		// vei essa porra precisa quando o cod pedir entrada double com ( . )
		Scanner input = new Scanner(System.in);

		double A, B, C, pi = 3.14159, a, b, c, d, e;
		// area de formas geometricas a,b,c,d,e
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		a = (A * C) / 2.0;
		b = pi * Math.pow(C, 2);
		c = ((A + B) * C) / 2.0;
		d = B * B;
		e = A * B;
		System.out.printf("TRIANGULO: %.3f%n", a);
		System.out.printf("CIRCULO: %.3f%n", b);
		System.out.printf("TRAPEZIO:  %.3f%n", c);
		System.out.printf("QUADRADO: %.3f%n", d);
		System.out.printf("RETANGULO: %.3f%n", e);

		input.close();
	}

}
