/*
 * Escrever um programa que receba vários números inteiros no teclado. 
 * E no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */
import java.util.*;
public class Lista3Ex6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double num, soma = 0, contador = 0, media;
		
		do {
			System.out.print("Informe um número: ");
			num = leia.nextDouble();
			soma += num;
			contador += 1;		
		}while(num != 0);
		
		media = soma/contador;
		System.out.printf("A média dos números informados é %.2f.",media);

	}

}
