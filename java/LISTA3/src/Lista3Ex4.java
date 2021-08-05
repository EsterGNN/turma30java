/*
 * Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
 * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções 
 * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
 * Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
 * o número de pessoas calmas; 
 * o número de mulheres nervosas; 
 * o número de homens agressivos; 
 * o número de outros calmos;
 * o número de pessoas nervosas com mais de 40 anos; 
 * o número de pessoas calmas com menos de 18 anos.
 */
import java.util.*;
public class Lista3Ex4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, i = 1, parada = 150;
		char sexo, op;
		int pessoasCalmas = 0, pessoasCalmasMenorDeIdade = 0, pessoasNervosas40Anos = 0, mulheresNervosas = 0, homensAgres = 0, outrosCalmos = 0;
		
		while (i <= parada) {
			//entradas
			System.out.print("Informe a idade da pessoa: ");
			idade = leia.nextInt();
			System.out.print("É do sexo femino (digite 1), masculino (digite 2) ou outros (digite 3)? ");
			sexo = leia.next().charAt(0);
			System.out.print("A pessoa é calma (digite 1), nervoso (digite 2) ou agressiva (digite 3)?");
			op = leia.next().charAt(0);
			
			//operações
			if(op == '1') {
				pessoasCalmas += 1;
				if(idade < 18) {
					pessoasCalmasMenorDeIdade += 1;
				}
			}
			if(op == '2' && idade > 40) {
				pessoasNervosas40Anos += 1;
			}
			if(sexo == '1' && op == '2') {
				mulheresNervosas += 1;
			}
			if(sexo == '2' && op == '3') {
				homensAgres += 1;
			}
			if(sexo == '3' && op == '1') {
				outrosCalmos += 1;
			}
			i += 1;
			
		}//fim do laço
		
		System.out.printf("\nSão %d pessoas calmas e, dentre elas, %d têm menos de 18 anos.",pessoasCalmas,pessoasCalmasMenorDeIdade);
		System.out.printf("\nSão %d mulheres nervosas e %d homens agressivos.",mulheresNervosas,homensAgres);
		System.out.printf("\nSão %d pessoas com mais 40 anos nervosas.",pessoasNervosas40Anos);
		System.out.printf("\nSão %d pessoas com outros para sexo calmas.",outrosCalmos);

	}

}
