import java.util.Scanner;

public class SegundoPrograma {
	
	public static void main(String[] args) {
		
		String nome;
		int anoNascimento, idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Informe o nome: ");
		nome = leia.nextLine();
		System.out.print("Informe o ano de nascimento: ");
		anoNascimento = leia.nextInt();
		
		idade = 2021 - anoNascimento;
		System.out.println("Oi, "+nome+", sua idade é "+idade+" anos."); 
		 
	}
	
}
