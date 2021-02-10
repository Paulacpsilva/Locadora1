package br.com.locadora.filmes.locadora;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.locadora.filmes.Catalogo;

public class AlugarFilme extends Catalogo {
	List<String> filmesalugados = new ArrayList<>();
	
	public void alugarFilme() throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual filme deseja alugar? ");
		String resposta = scan.nextLine(); // como faz para ignorar as letras maiusculas e minusculas?
		
		if (getFilmes().contains(resposta)) {
			System.out.println("Confirmar aluguel do filme " + resposta + " S/N");
			String resp2 = scan.next();
			if (resp2.equalsIgnoreCase("S") || resp2.equalsIgnoreCase("sim")) {
				System.out.println("Filme " + resposta + " Alugado com sucesso!");
				removerFilme(resposta);
				filmesalugados.add(resposta);
				encerrar();//aparece 2 vezes
			}
		} else 
			System.out.println("O filme " + resposta + " não consta no catalogo\n");
			encerrar();
			
		}
		
		
	
		
	public List<String> getFilmesalugados() {
		return filmesalugados;
	}
	
	public void encerrar() throws FileNotFoundException  {
		Scanner scan = new Scanner(System.in);
		System.out.println("Encerrar? S/N");
		String resp = scan.next();
		
		if(resp.equalsIgnoreCase("n")|| resp.equalsIgnoreCase("nao")) {
			alugarFilme();
		
		}else if (resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("sim")) {
			System.out.println("Programa encerrado!");
		} 
	}
		
		

}	
