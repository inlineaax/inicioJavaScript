package pacoteLeituraDeDados;

import java.math.*;
import java.util.*; // importar a opção de Scanner pra dentro do programa

public class leituraDeDados {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, nota4, frequencia, totalNotas;
		char statusAluno;
		
		Scanner entradaNotas = new Scanner(System.in);      // Scanner le e guarda entradas que digitar
		Scanner entradaCaractere = new Scanner(System.in);  // no teclado
		
		System.out.print("Digite o nome do aluno: ");
		String nomeAluno = entradaCaractere.nextLine(); // nextLine recebe a informação
		
		System.out.print("Digite um caractere para a situação do aluno: (O --> OK; P --> Pendência: ");
		statusAluno = entradaCaractere.nextLine().charAt(0);
		
		System.out.print("Digite a primeira nota: ");
		nota1 = entradaNotas.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = entradaNotas.nextDouble();
		System.out.print("Digite a terceira nota: ");
		nota3 = entradaNotas.nextDouble();
		System.out.print("Digite a quarta nota: ");
		nota4 = entradaNotas.nextDouble();
		
		System.out.print("Digite a frequencia do aluno: ");
		frequencia = entradaNotas.nextDouble();
	
		totalNotas = nota1 + nota2 + nota3 + nota4;
		boolean aprovado = totalNotas >= 30 && frequencia >= 0.75;
		
		System.out.printf("O(a) aluno(a) %s, obteve nota final: %.2f e frequencia: %.2f%%.\n"
				+ "A situação do aluno(a) é %c.\n"
				+ "Aluno aprovado? %b.", nomeAluno, totalNotas, frequencia * 100, statusAluno, aprovado); 
		
		

	}

}
