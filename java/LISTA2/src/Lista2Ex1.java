/* 
 * Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
*/

import java.util.*;
public class Lista2Ex1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int A, B, C;
		
		System.out.print("Digite um n�mero inteiro: ");
		A = leia.nextInt();
		System.out.print("Digite outro n�mero inteiro: ");
		B = leia.nextInt();
		System.out.print("Digite um �litmo n�mero inteiro: ");
		C = leia.nextInt();
		
		if(A >= B) {
			if(A >= C) {
				System.out.printf("O maior n�mero � %d.",A);
			}else {
				System.out.printf("O maior n�mero � %d.",C);
			}
		}
		else if(B >= C){
			System.out.printf("O maior n�mero � %d.",B);
		}
		else {
			System.out.printf("O maior n�mero � %d.",C);
		}

	}

}
