import java.util.Scanner;

public class TesteFuncao {
	public static void maind(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int anoNascimento;
		String nome;
		int tamanho = 50;
		
		linha(tamanho);
		System.out.print("Informe o nome: ");
		nome = leia.next();
		System.out.print("Informe o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		linhaBasica();
		System.out.printf("Idade: %d\n", 2021 - anoNascimento);
		
		
	}
	
	public static void linhaBasica() {
		System.out.println("------------------------------------------------------");
	}
	
	public static void linha(int tamanho) {
		for(int x = 1; x <= tamanho;x++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
