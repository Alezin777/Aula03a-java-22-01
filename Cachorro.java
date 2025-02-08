package br.edu.senaisp.modelo;

public class Cachorro {

	String nome;
	String raca;
	String cor ;
	int idade;
	
	
	public Cachorro(String nome, String raca, String cor, int idade) {
		super();
		this.nome = nome;
		this.raca = raca;
		this.cor = cor;
		this.idade = idade;
	}
	
	
	public String dogLate() {
		
		String latindo = "AUAUAUAUAU";
		return latindo;
	}
	
	public String dogCorre() {
		
		String correndo = "correndo";
		return correndo;
	}
	
}
