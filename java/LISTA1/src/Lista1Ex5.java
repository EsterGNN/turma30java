import java.util.Scanner;

public class Lista1Ex5 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, nota3, media;
		
		System.out.print("Informe as notas. \nNota 1: ");
		nota1 = ler.nextDouble();
		System.out.print("Nota 2: ");
		nota2 = ler.nextDouble();
		System.out.print("Nota 3: ");
		nota3 = ler.nextDouble();
		
		media = (nota1*2 + nota2*3 + nota3*5)/(2+3+5);
		System.out.println("Média final: "+media);
	}

}
