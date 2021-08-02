import java.util.Scanner;

public class Lista1Ex7 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		double A, B, C, D, E, F, x, y;
		
		System.out.print("Vamos resolver o sistema! Informe os coeficientes a, b, c, d, e, f. \na:");
		A = ler.nextDouble();
		System.out.print("b: ");
		B = ler.nextDouble();
		System.out.print("c: ");
		C = ler.nextDouble();
		System.out.print("d: ");
		D = ler.nextDouble();
		System.out.print("e: ");
		E = ler.nextDouble();
		System.out.print("f: ");
		F = ler.nextDouble();
		
		x = ((C*E)-(B*F))/((A*E)-(B*D));
		y = ((A*F)-(C*D))/((A*E)-(B*D));


		System.out.println("Valor de x: "+x+"\nValor de y: "+y);
	
	}
}
