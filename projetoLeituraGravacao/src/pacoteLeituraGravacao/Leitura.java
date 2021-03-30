package pacoteLeituraGravacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Leitura {

	public static void main(String[] args) {
		
		try {
			FileReader arquivo = new FileReader("C:\\arquivoDados.txt");
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			
			String linha;
			linha = lerArquivo.readLine();
			
			while (linha != null) {
				String[] dadosCliente = new String[4];
				dadosCliente = linha.split(";");
				System.out.printf("Código do cliente: %s.\n" +
				           "Nome do cliente: %s.\n" +
				           "Endereço: %s.\n" +
				           "Cidade: %s.\n", dadosCliente[0], dadosCliente[1], dadosCliente[2], dadosCliente[3]);
				
				linha = lerArquivo.readLine();
				System.out.println("");
							
				}
			    lerArquivo.close();
			    arquivo.close();
			    } catch (IOException e){
			System.out.println ("Erro lendo dados: " + e.getMessage());
			
		}

	}

}
