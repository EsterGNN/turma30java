/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 * Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)
 */
import java.util.*;
public class Lista3Ex3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade, quantidadeMenorVinteUm = 0, quantidadeMaiorCinquenta = 0;
		
		System.out.print("Informe a idade: ");
		idade = leia.nextInt();
		
		while(idade != -99) {
			if(idade < 21 && idade > 0) {
				quantidadeMenorVinteUm += 1;
			}
			else if(idade > 50) {
				quantidadeMaiorCinquenta += 1;
			}
			System.out.print("Informe a idade: ");
			idade = leia.nextInt();
		}
		
		System.out.printf("Temos %d pessoa(s) com menos de 21 anos e %d pessoa(s) com mais de 50 anos.",quantidadeMenorVinteUm,quantidadeMaiorCinquenta);

	}

}
