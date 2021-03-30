package classeContadores;

public class Contadores {

	public static void main(String[] args) {
		int contador = 0;
		System.out.printf("O valor atual do contador é...: %d.\n", contador);
		contador++;
		System.out.printf("O valor atual do contador é...: %d.\n", contador);
		contador = contador +1;
		System.out.printf("O valor atual do contador é...: %d.\n", contador);
		contador += 1;
		System.out.printf("O valor atual do contador é...: %d.\n", contador);	
		// contador = ele mesmo + constante
		// todos os valores adicionam + 1 ao contador 

	}

}
