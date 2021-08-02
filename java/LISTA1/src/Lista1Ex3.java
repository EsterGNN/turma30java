import java.util.Scanner;

public class Lista1Ex3 {
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int totalSegundos, horas, minutos, segundos;
		
		System.out.print("Informe a quantidade total de segundos que durou o evento: ");
		totalSegundos = ler.nextInt();
		
		horas = totalSegundos/3600;
		minutos = (totalSegundos % 3600)/60;
		segundos = ((totalSegundos % 3600) % 60);
		
		System.out.println("O evento durou "+horas+" hora(s), "+minutos+" minuto(es) e "+segundos+" segundo(s).");
		
	}

}
