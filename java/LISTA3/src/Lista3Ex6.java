/*
 * Escrever um programa que receba v�rios n�meros inteiros no teclado. 
 * E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
 */
import java.util.*;
public class Lista3Ex6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double num, soma = 0, contador = 0, media;
		
		do {
			System.out.print("Informe um n�mero: ");
			num = leia.nextDouble();
			soma += num;
			contador += 1;		
		}while(num != 0);
		
		media = soma/contador;
		System.out.printf("A m�dia dos n�meros informados � %.2f.",media);

	}

}
