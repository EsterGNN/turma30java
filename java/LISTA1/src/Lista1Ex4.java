import java.util.Scanner;

public class Lista1Ex4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double A, B, C, R, S, D;
		
		System.out.print("Informe o primeiro valor (A): ");
		A = ler.nextDouble();
		System.out.print("Informe o primeiro valor (B): ");
		B = ler.nextDouble();
		System.out.print("Informe o primeiro valor (C): ");
		C = ler.nextDouble();
		
		R = Math.pow(A + B, 2);
		S = Math.pow(B + C, 2);
		
		D = (R + S)/2;
		
		System.out.println("O valor esperado é "+D);
		
	}
}
