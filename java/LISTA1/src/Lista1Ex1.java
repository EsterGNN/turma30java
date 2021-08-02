import java.util.Scanner;

public class Lista1Ex1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int anos, meses, dias;
		
		System.out.print("Informe sua idade. \nAnos:");
		anos = ler.nextInt();
		System.out.print("Meses:");
		meses = ler.nextInt();
		System.out.print("Dias:");
		dias = ler.nextInt();
		
		System.out.println("Idade total passada em dias: "+dias);
		
	}
}
