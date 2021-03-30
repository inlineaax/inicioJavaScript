package pacoteAula2_7;

public class tiposDePrint {

	public static void main(String[] args) {
		
		int idade = 30;
		double altura = 1.81;
		String nome = "Joaquim José da Silva";
		boolean estudante = true;
		char sexo = 'M';
		
		System.out.println("idade: " + idade); //println quebra a linha
		System.out.println("altura: " + altura);
		
		System.out.printf("A idade de %s do sexo %c é %d \nA altura é %.2f.\nEle é estudante? %b", nome, sexo, idade, altura, estudante); 
		
		//printf entra os coringas
		//%s String
		//%d Int
		//%.2f float ou double com 2 casas decimais (2f = 2 casas, 3f = 3 casas...)
		//%b boolean
		//%c caractere (char)
		
		// o comando "\n", quebra a linha durante o print

	}

}
