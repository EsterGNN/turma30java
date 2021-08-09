package Funcionario;

import java.util.Scanner;

public class RegistroFuncionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Funcionario pessoa = new Funcionario("Ester Gomes Neves Nascimento", "1803");
		
		System.out.println("REGISTRE A HORA DE ENTRADA: ");
		pessoa.horaEntrada = leia.next();
		
		pessoa.trabalho('E', pessoa.horaEntrada);

		System.out.println("\nREGISTRE A HORA DE SAÍDA: ");
		pessoa.horaSaida = leia.next();
		
		pessoa.trabalho('S', pessoa.horaSaida);
		

	}

}
