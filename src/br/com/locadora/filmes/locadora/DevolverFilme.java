package br.com.locadora.filmes.locadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.locadora.filmes.Catalogo2;

public class DevolverFilme extends Catalogo2{
	List<String> filmesalugados = new ArrayList<>();
	
	public List<String> getFilmesalugados() {
		return filmesalugados;
	}
	
	public void devolverFilme() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual filme deseja devolver? ");
		String resposta = scan.nextLine().toLowerCase();
		System.out.println(getFilmesalugados().contains(resposta));
		
		
	}
}
