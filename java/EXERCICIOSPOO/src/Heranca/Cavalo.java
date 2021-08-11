package Heranca;

public class Cavalo extends Animal {
	private boolean correr;

	public Cavalo(boolean som, boolean correr) {
		super(som);
		this.correr = correr;
	}
	
	public Cavalo(String nome, int idade, boolean som, boolean correr) {
		super(nome,idade,som);
		this.correr = correr;
	}
	
	
	@Override
	public void emiteSom(boolean som) {
		if(som) {
			System.out.println("Hiin in in... Hiin in in... Hiin in in... Hiin in in... Hiin in in... \n");
		}
		else {
			System.out.println("... \n");
		}
	}
}
