import java.util.Scanner;

public class Lista1Ex6 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		double X1, Y1, X2, Y2, dX, dY, D;
		
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
		System.out.println("Distância entre as coordendas: "+D);
	
	}
}
