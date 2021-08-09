package Cliente;

import java.util.Scanner;

public class escolhaProduto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Cliente cliente = new Cliente();
		
		System.out.print("Informe seu nome: ");
		cliente.nome = leia.nextLine();
		
		System.out.print("\nDeseja que a referência seja feita no feminino (Digite a), no masculino (Digite o) ou neutro (Digite e)?");
		cliente.op = leia.next().toLowerCase().charAt(0);
		
		cliente.boasVindas();
		
		cliente.produtos();
		
		System.out.print("\nQual produto deseja adquirir, 1 ou 2?");
		cliente.opcaoProduto = leia.next().charAt(0);
		
		cliente.escolhaProduto(cliente.opcaoProduto);

	}

}
