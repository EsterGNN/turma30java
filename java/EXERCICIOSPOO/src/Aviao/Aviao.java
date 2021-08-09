package Aviao;

public class Aviao {
	
	public String usoParticularPublico;
	public String horaVoo;  
	public String horaPouso; 
	
	public void escolhaUso() {
		System.out.println("O avião será para uso particular (Digite PA) ou será o público (Digite PVD)?");
	}
	
	public void escolhaHoraVoo() {
		System.out.println("Deseja decolar em qual horário?");
	}
	
	
	public void anuncio(String opcao) {
		if(usoParticularPublico.equals("PA")) {
			System.out.println("O avião para uso particular levantará voo às "+this.horaVoo+".");
		}
		if(usoParticularPublico.equals("PVD")) {
			System.out.println("O avião de uso público levantará voo às "+this.horaVoo+".");
		}
	}
	
	
	
}
