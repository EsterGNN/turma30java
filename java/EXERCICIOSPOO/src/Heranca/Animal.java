package Heranca;

public class Animal {
	private String nome;
	private int idade;
	private boolean som;
	
	public Animal(boolean som) {
		super();
		this.som = som;
	}
	
	public Animal(String nome, int idade, boolean som) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public boolean isSom() {
		return som;
	}



	public void setSom(boolean som) {
		this.som = som;
	}


	//método de emissão de som
	public void emiteSom(boolean som) {
		if(som) {
			System.out.println("HÁ BARULHO DE ANIMAL! \n");
		}
		else {
			System.out.println("NÃO HÁ BARULHO DE ANIMAL! \n");
		}
	}
}
