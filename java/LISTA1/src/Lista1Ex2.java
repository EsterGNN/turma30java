import java.util.Scanner;

public class Lista1Ex2 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int totalDias, anos, meses, dias;
		
		System.out.print("Informe a idade total em dias: ");
		totalDias = ler.nextInt();
		
		anos = totalDias/360;
		meses = (totalDias % 360)/30;
		dias = ((totalDias % 360) % 30);
		
		System.out.println("Você tem "+anos+" ano(s), "+meses+" mes(es) e "+dias+" dia(s) de idade.");
	}
}
