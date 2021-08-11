package Heranca;

public class Preguica extends Animal {
	private boolean subirEmArvore;
	
	public Preguica(boolean som, boolean subirEmArvore) {
		super(som);
		this.subirEmArvore = subirEmArvore;
	}
	
	public Preguica(String nome, int idade, boolean som, boolean subirEmArvore) {
		super(nome, idade, som);
		this.subirEmArvore = subirEmArvore;
	}
	
	@Override
	public void emiteSom(boolean som) {
		if(som) {
			System.out.println("Chomp... Chomp... Chomp... Chomp... Chomp... \n");
		}
		else {
			System.out.println("... \n");
		}
	}
	
}
