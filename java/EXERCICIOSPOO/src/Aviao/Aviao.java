package Aviao;

public class Aviao {
	
	public String usoParticularPublico;
	public String horaVoo;  
	public String horaPouso; 
	
	public void escolhaUso() {
		System.out.println("O avi�o ser� para uso particular (Digite PA) ou ser� o p�blico (Digite PVD)?");
	}
	
	public void escolhaHoraVoo() {
		System.out.println("Deseja decolar em qual hor�rio?");
	}
	
	
	public void anuncio(String opcao) {
		if(usoParticularPublico.equals("PA")) {
			System.out.println("O avi�o para uso particular levantar� voo �s "+this.horaVoo+".");
		}
		if(usoParticularPublico.equals("PVD")) {
			System.out.println("O avi�o de uso p�blico levantar� voo �s "+this.horaVoo+".");
		}
	}
	
	
	
}
