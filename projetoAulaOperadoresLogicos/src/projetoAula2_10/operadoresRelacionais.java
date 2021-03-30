package projetoAula2_10;

public class operadoresRelacionais {

	public static void main(String[] args) {
		int var1 = 10, var2 = 20, var3 = 20;
		boolean resultado, resultado2, resultado3, resultado4, resultado5, resultado6;
		
		resultado = (var1 == var2); // é igual
		resultado2 = (var2 == var3); // --
		resultado3 = (var1 != var2); // é diferente
		resultado4 = (var1 > var2); // é maior
		resultado5 = (var1 < var3); // é menor
		resultado6 = (var2 >= var3); // é maior ou igual
		System.out.printf("As variáveis são iguais? \nResposta: %b", resultado);
		System.out.printf("\nAs variáveis são iguais? \nResposta: %b", resultado2);
		System.out.printf("\nAs variáveis são diferentes? \nResposta: %b", resultado3);
		System.out.printf("\nA variável var1 é maior que var2? \nResposta: %b", resultado4);
		System.out.printf("\nA variável var1 é menor que var3? \nResposta: %b", resultado5);
		System.out.printf("\nA variável var2 é maior ou igual que var3? \nResposta: %b", resultado6);

	}

}
