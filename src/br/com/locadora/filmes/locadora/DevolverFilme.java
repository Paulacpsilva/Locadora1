package br.com.locadora.filmes.locadora;

import java.util.Scanner;

public class DevolverFilme extends AlugarFilme{
	
	Scanner scan = new Scanner(System.in);
	
	public void devolverFilme() {
		System.out.println("Qual filme deseja devolver? ");
		String resposta = scan.nextLine();
		
		if (getFilmesalugados().contains(resposta)) {// nao localiza na lista
			System.out.println("Confirmar devolução do filme " + resposta + "S/N");
			if (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("sim")) {
				System.out.println("Filme " + resposta + " devolvido com sucesso");
				filmesalugados.remove(resposta);
			} 
		}else
			System.out.println("Nao tem");
	}
}
