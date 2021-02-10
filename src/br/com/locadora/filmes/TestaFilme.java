package br.com.locadora.filmes;


import java.io.FileNotFoundException;
import java.util.Scanner;

import com.sun.source.tree.NewClassTree;

import br.com.locadora.filmes.locadora.AlugarFilme;
import br.com.locadora.filmes.locadora.DevolverFilme;


public class TestaFilme {
	public static void main(String[] args) throws FileNotFoundException  {
		
		Catalogo cat = new Catalogo();
		AlugarFilme al = new AlugarFilme();
		DevolverFilme dev = new DevolverFilme();
	
		al.alugarFilme();
		
		System.out.println(al.getFilmesalugados());
		
		dev.devolverFilme();
		System.out.println(cat.getFilmes());
		al.removerFilme("Superintelligence");
		
		System.out.println(cat.getFilmes());
}

}
