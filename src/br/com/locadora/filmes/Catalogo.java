package br.com.locadora.filmes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalogo {
	private List<String> filmes = new ArrayList<>();
	
	public List<String> getFilmes() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("filmes.txt"));
		while(scan.hasNextLine()) {
			String linha = scan.nextLine();
			filmes.add(linha);
		}
			return filmes;
	}
	
	public void removerFilme(String nome) {
		filmes.remove(nome);
	}
	
	
}
		
			
			
		
	
	

	
	
		
	
	
		
	

