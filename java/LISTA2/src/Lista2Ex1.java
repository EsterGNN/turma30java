/* 
 * Faça um programa que receba três inteiros e diga qual deles é o maior.
*/

import java.util.*;
public class Lista2Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int A, B, C;
		
		System.out.print("Digite um número inteiro: ");
		A = leia.nextInt();
		System.out.print("Digite outro número inteiro: ");
		B = leia.nextInt();
		System.out.print("Digite um úlitmo número inteiro: ");
		C = leia.nextInt();
		
		if(A >= B) {
			if(A >= C) {
				System.out.printf("O maior número é %d.",A);
			}else {
				System.out.printf("O maior número é %d.",C);
			}
		}
		else if(B >= C){
			System.out.printf("O maior número é %d.",B);
		}
		else {
			System.out.printf("O maior número é %d.",C);
		}

	}

}
