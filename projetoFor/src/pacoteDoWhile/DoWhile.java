package pacoteDoWhile;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		char continuar = 'N';
		System.out.println("Deseja continuar? S = Sim, N = Nao");
		continuar = entrada.nextLine().charAt(0);
		
		while (continuar == 'S') {                                 // while testa no inicio
			System.out.println("Mensagem");
			System.out.println("Deseja continuar? S = Sim, N = Nao");
			continuar = entrada.nextLine().charAt(0);
		}
		
		do {                                                        // do testa no final  
			System.out.println("Mensagem");
			System.out.println("Deseja continuar? S = Sim, N = Nao");
			continuar = entrada.nextLine().charAt(0);
			
		} while (continuar == 'S');

	}

}
