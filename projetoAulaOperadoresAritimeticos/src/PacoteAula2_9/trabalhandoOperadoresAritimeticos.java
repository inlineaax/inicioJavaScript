package PacoteAula2_9;

import java.math.*;

public class trabalhandoOperadoresAritimeticos {

	public static void main(String[] args) {
		
		// Calculadora de delta e bhaskara
		// X^2 + 12X -13 = 0
		
		double a, b, c;
		a = 1;
		b = 12;
		c = -13;
		
		double delta = 0;
		
		delta = (b * b - (4 * a * c));
		System.out.printf("O valor de delta é: %.0f\n", delta);
		
		double x_linha = 0;
		x_linha = (-b + Math.sqrt(delta)) / (2*a);
		System.out.printf("O valor de x' é: %.0f", x_linha);
		
		double x_duaslinhas = 0;
		x_duaslinhas = (-b - Math.sqrt(delta)) / (2*a);
		System.out.printf("\nO valor de x'' é: %.0f", x_duaslinhas);
		
				

	}

}
