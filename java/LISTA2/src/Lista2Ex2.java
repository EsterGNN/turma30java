/*
 * Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
 */
import java.util.*;
public class Lista2Ex2 {
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
				if(B >= C) {
					System.out.printf("Temos %d <= %d <= %d.",C,B,A);
				}
				else {
					System.out.printf("Temos %d <= %d <= %d.",B,C,A);
				}
			}else {
				System.out.printf("Temos %d <= %d <= %d.",B,A,C);
			}
		} //Agora s� temos A < B.
		else if(B >= C){
			if(A >= C) {
				System.out.printf("Temos %d <= %d <= %d.",C,A,B);
			}
			else {
				System.out.printf("Temos %d <= %d <= %d.",A,C,B);
			}
		}//S� nos resta A < B e B < C
		else {
			System.out.printf("Temos %d <= %d <= %d.",A,B,C);
		}
	}
}
