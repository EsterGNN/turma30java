package programas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLojaNovo {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String auxNome;
		
		List<String> cadastro = new ArrayList<>();
		
		cadastro.add("SPFC");
		cadastro.add("SANTOS");
		cadastro.add("PALMEIRAS");
		cadastro.add("CORINTHIANS");
		cadastro.add("JUVENTOS");
		
		System.out.println("TAMANHO DA LISTA: "+ cadastro.size());
		
		cadastro.add(1,"GUARANI"); //ADICIONA NA POSIÇÃO 1
		int x = 0;
		for(String time : cadastro) {
			System.out.println(x+" - "+time);
			x++;
		}
		System.out.println(cadastro.get(4)); //MOSTRA NA POSIÇÃO 4
		
		
		System.out.println("Digite o número do time: ");
		x = leia.nextInt();
		System.out.println("Time selecionado: "+cadastro.get(x));
		
		System.out.println("Digite o número do time que deseja excluir: ");
		x = leia.nextInt();
		System.out.println("Time selecionado para exclusão: "+cadastro.get(x));
		cadastro.remove(x);
		
		System.out.println("Digite o nome do time que deseja excluir: ");
		auxNome = leia.next().toUpperCase();
		x = cadastro.indexOf(auxNome);
		System.out.println("Time selecionado para exclusão: "+cadastro.get(x));
		cadastro.remove(x);
		
		System.out.println("NOVA LISTA");
		leia.nextLine();
		int y = 0;
		for(String time : cadastro) {
			System.out.println(y+" - "+time);
			y++;
		}
		
		/*
		for(String time : cadastro) {
			System.out.println(time);
		}
		*/

	}

}
