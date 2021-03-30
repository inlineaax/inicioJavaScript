package PacoteAula2_8;

public class operadoresAritimeticos {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, totals = n1 + n2, totalm = n1 * n2;
		double nn1 = 0, nn2 = 0, nnn1 = 0, nnn2 = 0, totald = 0, totalr =0;
		n1 = 10;
		n2 = 20;
		nn1 = 45;
		nn2 = 7;
		nnn1 = 83;
		nnn2 = 4;
		totald = nn1 / nn2;
		totalr = nn1 % nn2; //O sinal % pede o resto da divisão do número pelo outro
		
				
		System.out.printf("O resultado de %d + %d = %d.", n1, n2, totals);
		System.out.printf("\nO resultado de %d multiplicado por %d = %d.", n1, n2, totalm);
		System.out.printf("\nO resultado de %.2f dividido por %.2f = %.4f.", nn1, nn2, totald);
		System.out.printf("\nO resto de divisão de %.2f dividido por %.2f = %.4f.", nnn1, nnn2, totalr);
				

	}

}
