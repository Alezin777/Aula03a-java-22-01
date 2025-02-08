package br.edu.senaisp.modelo;
public class PetTeste {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro("Dog", "Rusk", "Preto", 5 );
		
		System.out.println(dog.dogLate());
		System.out.println(dog.nome + " esta "+  dog.dogCorre());
		System.out.println( "A idade " + dog.idade + " anos");
	}

}
