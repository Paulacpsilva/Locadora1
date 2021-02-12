package br.com.locadora.filmes;


import java.io.FileNotFoundException;
import java.util.Scanner;

import br.com.locadora.filmes.locadora.AlugarFilme2;
import br.com.locadora.filmes.locadora.DevolverFilme;


public class TestaFilme extends DevolverFilme{
	public static void main(String[] args) throws FileNotFoundException  {
		
		Catalogo2 cat = new Catalogo2();
		AlugarFilme2 al = new AlugarFilme2();
		DevolverFilme dev = new DevolverFilme();
		
		Scanner scan  = new Scanner(System.in);
		
		
		System.out.println("----------Locadora de filmes--------------");
		System.out.println("[1] Alugar filme");
		System.out.println("[2] Devolver filme");
		System.out.println("[3] Sair");
		int locadora = scan.nextInt();
		
		switch (locadora) {
		case 1:
			al.alugarFilme();
			break;
		case 2:
			dev.devolverFilme();
			break;
		case 3:
			System.out.println("Saindo...");
			break;
		default:
			//o q fazer?
			break;
		}
		
}

}
