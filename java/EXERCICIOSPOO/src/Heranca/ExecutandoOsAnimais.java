package Heranca;

import java.util.Scanner;

public class ExecutandoOsAnimais {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Animal cachorro = new Cachorro(true,true);
		Animal cavalo = new Cavalo(true,true);
		Preguica preguica = new Preguica(true,true); //'Preguica' no lugar de 'Animal' só para mostrar que dá para de mais de um jeito
		
		String auxNome;
		int auxIdade;
		
		System.out.print("Informe o nome do cachorro: ");
		auxNome = leia.next();
		cachorro.setNome(auxNome);
		System.out.print("Informe a idade do cachorro: ");
		auxIdade = leia.nextInt();
		cachorro.setIdade(auxIdade);
		
		System.out.print("Informe o nome do cavalo: ");
		auxNome = leia.next();
		cavalo.setNome(auxNome);
		System.out.print("Informe a idade do cavalo: ");
		auxIdade = leia.nextInt();
		cavalo.setIdade(auxIdade);
		
		System.out.print("Informe o nome do preguiça: ");
		auxNome = leia.next();
		preguica.setNome(auxNome);
		System.out.print("Informe a idade do preguiça: ");
		auxIdade = leia.nextInt();
		preguica.setIdade(auxIdade);
		
		System.out.println("\nPara o cachorro "+cachorro.getNome()+" de "+cachorro.getIdade()+" anos:");
		cachorro.emiteSom(cachorro.isSom());
		
		System.out.println("Para o cavalo "+cavalo.getNome()+" de "+cavalo.getIdade()+" anos:");
		cavalo.emiteSom(cavalo.isSom());
		
		System.out.println("Para o preguica "+preguica.getNome()+" de "+preguica.getIdade()+" anos:");
		preguica.emiteSom(preguica.isSom());
		

	}

}
