package application;

import entities.Funcionario;
import entities.Terceiro;

public class TesteFuncionario {
	public static void main(String[] args) {

		Funcionario func1 = new Funcionario("MAT-0030201", 44, 8.5);
		Terceiro ter1 = new Terceiro("MAT-0010203", 44, 8.5, 300);

		System.out.println("Salario do funcionario");

		System.out.println(func1.calculoSalario());
		
		System.out.println("Salario do terceiro");
		
		System.out.println(ter1.calculoSalario());
	}
}
