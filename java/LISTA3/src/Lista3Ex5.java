/*
 * Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 * No final, mostre a soma dos números digitados.(DO...WHILE)
 */
import java.util.*;
public class Lista3Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double num, soma = 0;
		
		do {
			System.out.print("\nInforme um número: ");
			num = leia.nextDouble();
			soma += num;
		}while(num != 0);
		
		System.out.print("\nSoma dos números informados: "+soma);

	}

}
