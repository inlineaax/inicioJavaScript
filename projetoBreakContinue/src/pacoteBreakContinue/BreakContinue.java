package pacoteBreakContinue;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int numero = 0, somatorio = 0;
		
		System.out.println("Digite o número desejado: ");
		numero = ent.nextInt();
		
		
		while (numero > 0) {
			somatorio =  somatorio + numero;
			
			System.out.println("Digite o número desejado: ");
			numero = ent.nextInt();
			
			if (numero == 18)
				break;
			
		}
		System.out.printf("O somatorio foi: %d.", somatorio);

	}

}
