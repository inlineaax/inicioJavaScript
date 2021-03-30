package projetoAula2_6;

public class classeAulaManipulandoString {

	public static void main(String[] args) {
		String nome, nome2;
		nome = "Jose da Silva Costa";       //Criação de variaveis
		nome2 = "Maria Clara Costa";
				
		System.out.println(nome);
		System.out.println(nome2);
		
		int tamanhoDoNome = nome.length(), tamanhoDoNome2 = nome2.length(); //tamanho dos nomes
		
		System.out.println("A variável nome tem " + tamanhoDoNome + " caracteres");
		System.out.println("A variável nome2 tem " + tamanhoDoNome2 + " caracteres");
		
		int totalCaracteres = tamanhoDoNome + tamanhoDoNome2; //tamanho dos nomes juntos
		System.out.println("O total de caracteres das duas variáveis é " + totalCaracteres);
		
		String nomesConcatenados = nome.concat(nome2); //concatena as variaveis
		System.out.println(nomesConcatenados);
		
		String nomeSemA = nome.replace('a', '9'); //Substitui algum char
        System.out.println(nomeSemA);
		
		String somenteNome = nome2.substring(6, 11); //Substrai o nome (onde começa, onde termina)
		System.out.println(somenteNome);
		
		String nomeTudoMaiusculo = nome.toUpperCase(); //escrever o nome todo maiusculo
		System.out.println(nomeTudoMaiusculo);
		
		String nomeTudoMinusculo = nome.toLowerCase(); //escrever o nome todo minusculo
		System.out.println(nomeTudoMinusculo);

	}

}
