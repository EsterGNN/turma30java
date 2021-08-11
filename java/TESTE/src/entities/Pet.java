package entities;

public class Pet {
	
	private String raca;
	private char porte;
	private int anoNascimento;
	
	//contrutores
	public Pet(String raca) {
		super();
		this.raca = raca;
	}

	public Pet(String raca, int anoNascimento) {
		super();
		this.raca = raca;
		this.anoNascimento = anoNascimento;
	}
	
	
	//getters and setters
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public char getPorte() {
		return porte;
	}

	public void setPorte(char porte) {
		this.porte = porte;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	//método
	public void emiteSom() {
		System.out.println("EMITINDO O SOM DO ANIMAL...");
	}
	
	public int idade() {
		int idade = 2021 - this.anoNascimento;
		return idade;
	}
	
	
}
