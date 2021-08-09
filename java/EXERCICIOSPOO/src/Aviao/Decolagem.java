package Aviao;

import java.util.Scanner;

public class Decolagem {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Aviao aviao = new Aviao();
		
		aviao.escolhaUso();
		aviao.usoParticularPublico = leia.next().toUpperCase();
		
		aviao.escolhaHoraVoo();
		aviao.horaVoo = leia.next();
		
		aviao.anuncio(aviao.horaVoo);
		

	}

}
