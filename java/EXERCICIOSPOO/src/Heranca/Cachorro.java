package Heranca;

public class Cachorro extends Animal {
	private boolean correr;

	public Cachorro(boolean som, boolean correr) {
		super(som);
		this.correr = correr;
	}
	
	public Cachorro(String nome, int idade, boolean som, boolean correr) {
		super(nome, idade, som);
		this.correr = correr;
	}
	
	@Override
	public void emiteSom(boolean som) {
		if(som) {
			System.out.println("AU AU AU AU AU AU AU AU AU AU AU AU AU AU AU AU AU ...\n");
		}
		else {
			System.out.println("... \n");
		}
	}
	
}
