package programas;

import java.util.Scanner;

public class CadNovoAluno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		// instanciar um aluno
		
		Aluno exemplo1 = new Aluno();
		exemplo1.nome = "ESTER";
		exemplo1.nota = 5;
		exemplo1.matricula = "MAT-01";
		exemplo1.anoNascimento = 2000;
		Aluno exemplo2 = new Aluno();
		exemplo2.anoNascimento = 1999;
		
		
		exemplo1.mostraIdade(2031);
		exemplo2.mostraIdade();
		exemplo2.mostraIdade(2021);
		exemplo2.mostraIdade(2021, 1980);
		
		
		Aluno exemplo3 = new Aluno();
		System.out.print("Informe o nome do aluno: ");
		exemplo3.nome = leia.next();
		
		
		System.out.println(exemplo1.nome+" "+exemplo1.matricula);
		if(exemplo1.nota >= 5) {
			System.out.println("Continue assim.");
		}
		
	}

}
