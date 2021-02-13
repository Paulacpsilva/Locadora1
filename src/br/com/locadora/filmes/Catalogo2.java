package br.com.locadora.filmes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Catalogo2 {
	private List<String> filmes2 = new ArrayList<String>();
	
	public List<String> getFilmes2() {
		try {
			for (String line : Files.readAllLines(Paths.get("filmes.txt"))) {
				filmes2.add(line.toLowerCase());
			}
		} catch (IOException e) {
			System.out.println("erro ao ler o arquivo texto...."+e.getLocalizedMessage());
		}
		return filmes2;
	
	}
	
	
}
