import java.util.Scanner;

public class Lista1Ex6 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		String nome;
		double X1, Y1, X2, Y2, dX, dY, D;
		
		System.out.print("Qual seu nome? ");
		nome = ler.nextLine();
		System.out.print("Informe as coordenadas do PRIMEIRO ponto. \nX: ");
		X1 = ler.nextDouble();
		System.out.print("Y: ");
		Y1 = ler.nextDouble();
		System.out.print("Informe as coordenadas do SEGUNDO ponto. \nX: ");
		X2 = ler.nextDouble();
		System.out.print("Y: ");
		Y2 = ler.nextDouble();
		
		dX = Math.pow(X2-X1, 2);
		dY= Math.pow(Y2-Y1, 2);
		
		D = Math.sqrt(dX + dY);
		//%f - double
		//%d - int
		//%s - string
		//%b - boolean
		System.out.printf("Olá, %s. Distância entre as coordendas: %.2f",nome,D);
	
	}
}
