package pacoteFor;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
	//	for (inicialização, condição, incremento)
		
		int i = 0, j = 0;
		
	/*	System.out.println("Inicio. Não vai repetir"); // nao se repete
		for (i = 0; i < 10; i++) { // i++ adiciona 1 a cada looping, i-- tira 1 a cada looping
			System.out.printf("Valor de i : %d.\n", i); // se repete tudo que está dentro de {}
			for (j = 0; j <5; j++) {
				System.out.printf("     Valor de j : %d.\n", j);
			}
		      
		}
		System.out.println("Fim. Não vai repetir"); // nao se repete */
		
		for (i = 0; i < 10; i++) {                 //Tabuada
			System.out.printf("Tabuada do %d.\n", i);
			for (j = 0; j < 10; j++) {
				System.out.printf("%d * %d = %d.\n", i, j, i*j);
			}
		}

	}

}
