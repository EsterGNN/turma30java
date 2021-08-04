import java.util.*;

public class ExemploSalario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		char OP, fim;
		double salario, imposto;
		
		System.out.print("Qual seu nome?");
		nome = leia.next();
		
		System.out.println("Como podemos nos referenciar a você? Escolha uma das opções: F (ELA), M (ELE), E (ELU).)");
		OP = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Qual seu salário?");
		salario = leia.nextDouble();
		
		if(OP == 'F') {
			fim = 'a';
			System.out.printf("Cara, %s,",nome);
		}
		else if(OP == 'M') {
			fim = 'o';
			System.out.printf("Caro, %s,",nome);
		}
		else if(OP == 'E') {
			fim = 'e';
			System.out.printf("Care, %s,",nome);
		}
		
		if(salario <= 2000) {
			System.out.print(" você está insent.");
			
		}else if(salario > 2000 && salario <= 5000){
			imposto = 5000*0.15;
			System.out.printf(" seu imposto é de R$ %f e seu salário restante é R$ %f.",imposto, (salario-imposto));
		}
		else {
			imposto = 5000*0.25;
			System.out.printf(" seu imposto é de R$ %f e seu salário restante é R$ %f.",imposto, (salario-imposto));
		}

	}

}
