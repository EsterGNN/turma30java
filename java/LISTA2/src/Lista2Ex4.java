/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
 * Se for par exiba também a raiz quadrada do mesmo; 
 * se for ímpar exiba o número elevado ao quadrado.
 */
import java.util.*;
public class Lista2Ex4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numEntrada;
		double numSaida;
		
		System.out.print("Digite um número: ");
		numEntrada = leia.nextInt();
		
		if(numEntrada < 0) {
			System.out.println("\nNão podemos calcular.");
		}
		else if(numEntrada == 0) {
			System.out.println("\nO número é neutro.");
		}
		else if(numEntrada % 2 == 0) {
			numSaida = Math.sqrt(numEntrada);
			System.out.printf("\nA raiz quadrada de %d é %.3f.",numEntrada,numSaida);
		}
		else {
			numSaida = Math.pow(numEntrada,2);
			System.out.printf("\nO quadrado de %d é %.2f.",numEntrada,numSaida);
		}
	}
}
