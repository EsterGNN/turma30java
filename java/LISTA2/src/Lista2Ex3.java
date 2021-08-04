/*
 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
 * 10-14 infantil             15-17 juvenil              18-25 adulto
 */
import java.util.*;
public class Lista2Ex3 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.print("Informe sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("Categoria INFANTIL.");
		}
		else if(idade >= 15 && idade <= 17) {
			System.out.println("Categoria JUNEVIL.");
		}
		else if(idade >= 18 && idade <= 25) {
			System.out.println("Categoria ADULTO.");
		}
		else {
			System.out.println("Categoria não informada.");
		}
	}

}
