package pacoteArrays;

import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
	 // tipo[] nome = new tipo[tamanho];
		int[] numeros = new int[5];
		int total = 0, i = 0;
		Scanner ent = new Scanner(System.in);
				
		for (i = 0; i < 5; i++) {
			System.out.printf("Digite o %dº número: ", i+1);
			numeros[i] = ent.nextInt();
			total = total + numeros[i];
			System.out.printf("Total parcial: %d.\n", total);
			
		}
		/*numeros[0] = 10;
		numeros[1] = 15;
		numeros[2] = 13;
		numeros[3] = 1;
		numeros[4] = 7;
		
		total = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];*/
		System.out.printf("O valor total é de: %d", total);
		
		
	}

}
