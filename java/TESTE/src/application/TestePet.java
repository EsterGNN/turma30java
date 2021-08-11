package application;

import entities.Cachorro;
import entities.Gato;
import entities.Pet;

public class TestePet {

	public static void main(String[] args) {
	
		Cachorro pet1 = new Cachorro("PITBULL",false);
		Gato pe2 = new Gato("SIAMES",2014,true);
		
		pet1.setAnoNascimento(2019);
		
		System.out.println("Raça: "+pet1.getRaca()+" - Idade: "+pet1.idade());
		pet1.emiteSom();

	}

}
