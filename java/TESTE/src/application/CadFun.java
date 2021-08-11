package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class CadFun {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		List<Funcionario> folha = new ArrayList<>();
		//char tipo;
		char op;
		
		do {
			System.out.print("O empregado é F (funcionario) ou T (terceiro)?");
			char tipo = leia.next().toUpperCase().charAt(0);
			System.out.print("Informe a matrícula: ");
			String matricula = leia.next().toUpperCase();
			System.out.print("Informe a quantidade total de horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.print("Qual o valor pago por hora?");
			double valorPorHora = leia.nextDouble();
			if(tipo == 'T') {
				System.out.println("Informe o valor do adicional: ");
				double adicional = leia.nextDouble();
				folha.add(new Terceiro(matricula,horasTrabalhadas,valorPorHora,adicional));
			}
			else if(tipo == 'F') {
				folha.add(new Funcionario(matricula,horasTrabalhadas,valorPorHora));
			}
			System.out.print("Continua? [S/N]");
			op = leia.next().toUpperCase().charAt(0);
			
		} while(op == 'S');
		
		for(Funcionario fun : folha) {
			System.out.printf("MATRÍCULA FUNCIONARIO: %s - SALÁRIO: %.2f\n",fun.getMatricula(),fun.calculoSalario());
		}

	}

}
