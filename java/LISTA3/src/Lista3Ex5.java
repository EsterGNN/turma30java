/*
 * Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 * No final, mostre a soma dos n�meros digitados.(DO...WHILE)
 */
import java.util.*;
public class Lista3Ex5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double num, soma = 0;
		
		do {
			System.out.print("\nInforme um n�mero: ");
			num = leia.nextDouble();
			soma += num;
		}while(num != 0);
		
		System.out.print("\nSoma dos n�meros informados: "+soma);

	}

}
