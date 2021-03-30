package pacoteInstrucaoIfElse;

import java.math.*;
import java.util.*;

public class praticaIfElse {

	public static void main(String[] args) {
		
		double n1, n2, n3, total, mediaAvaliacoes, frequencia;
		Scanner entrada = new Scanner(System.in);
		String situacao;
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.println("Digite a primeira nota: ");
		n2 = entrada.nextDouble();
		System.out.println("Digite a primeira nota: ");
		n3 = entrada.nextDouble();
		
		total = n1 + n2 + n3;
		mediaAvaliacoes = total / 3;
		
		System.out.println("Digite a frequencia do aluno(a): ");
		frequencia = entrada.nextDouble();
		
		if (total >= 70 && frequencia >= 0.75)
			situacao = "Aprovado";
		else if (total >= 40 && total < 70 && frequencia >= 0.75)
			situacao = "Recuperação";
		else 
			situacao = "Reprovado";
		
		System.out.printf("O aluno(a) obteve nota total %.2f e média por avaliacao de %.2f."
				+ " A frequencia foi %.2f. Com isso o aluno está %s.", total, mediaAvaliacoes, frequencia * 100, situacao);
		
		
		

	}

}
