import java.util.Scanner;

public class TesteEnquanto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome = "", nomeMaiorSalario = "";
		double salario = 0, maiorSalario = 0;
		
		//System.out.print("Digite o nome: ");
		//nome = leia.next();
		//System.out.print("Digite o salário: ");
		//salario = leia.nextDouble();
		
		do {
			System.out.print("Digite o nome: ");
			nome = leia.next();
			System.out.print("Digite o salário: ");
			salario = leia.nextDouble();
			
			if(salario > maiorSalario) {
				maiorSalario = salario;
				nomeMaiorSalario = nome;
			}
		}while(salario > 0);
		
		System.out.printf("O maior salário é %.2f de %s.",maiorSalario,nomeMaiorSalario);
		

	}

}
