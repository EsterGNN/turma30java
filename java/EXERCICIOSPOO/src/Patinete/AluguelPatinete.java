package Patinete;

import java.util.Scanner;

public class AluguelPatinete {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Patinete alugador = new Patinete();
		
		alugador.disponibilidade('S');
		
		System.out.print("Você que deseja alugar o patinete, informe seu nome: ");
		alugador.nomeAlugador = leia.nextLine();
		
		
		System.out.print("Informe a hora (em valor numérico e sem minutos) que está retirando o patinete: ");
		alugador.horaRetirada = leia.nextDouble();
		
		alugador.disponibilidade('N');
		
		alugador.registro(alugador.nomeAlugador);
		
		System.out.print("\nInforme a hora (em valor numérico e sem minutos) que está devolvendo o patinete: ");
		alugador.horaEntrega = leia.nextDouble();
		
		
		System.out.println("\nValor total a ser pago pelo aluguel: R$ "+alugador.custoTotal(alugador.horaEntrega, alugador.horaRetirada));
	}

}
