package pacoteLeituraGravacao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Gravacao {

	public static void main(String[] args) {
		
		try {
			FileWriter arquivo = new FileWriter("D:\\saidaDados.txt");
			PrintWriter gravarArquivo = new PrintWriter(arquivo);
			
			for (int i = 0; i < 1000; i++) {
				gravarArquivo.printf("Valor de i: %d.%n", i);				
			}
			gravarArquivo.close();
			arquivo.close();
			
			
		} catch (IOException e){
			System.out.println("Ocorreu um erro ao gravar o arquivo: " + e.getMessage());
			
		}
		System.out.println("Fim da execução.");
		
		

	}

}
