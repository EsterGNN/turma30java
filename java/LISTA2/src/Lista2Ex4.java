/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
 * Se for par exiba tamb�m a raiz quadrada do mesmo; 
 * se for �mpar exiba o n�mero elevado ao quadrado.
 */
import java.util.*;
public class Lista2Ex4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numEntrada;
		double numSaida;
		
		System.out.print("Digite um n�mero: ");
		numEntrada = leia.nextInt();
		
		if(numEntrada < 0) {
			System.out.println("\nN�o podemos calcular.");
		}
		else if(numEntrada == 0) {
			System.out.println("\nO n�mero � neutro.");
		}
		else if(numEntrada % 2 == 0) {
			numSaida = Math.sqrt(numEntrada);
			System.out.printf("\nA raiz quadrada de %d � %.3f.",numEntrada,numSaida);
		}
		else {
			numSaida = Math.pow(numEntrada,2);
			System.out.printf("\nO quadrado de %d � %.2f.",numEntrada,numSaida);
		}
	}
}
