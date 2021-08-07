import java.util.Scanner;

public class AGENDA {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String agenda[][] = new String[24][31];
		int auxDia, auxHora;
		char op;
		
		do {
			System.out.print("Informe o dia do evento: ");
			auxDia = leia.nextInt()-1;
			System.out.print("Informe a hora do evento: ");
			auxHora = leia.nextInt();
			leia.nextLine();
			System.out.print("Informe o evento: ");
			agenda[auxHora][auxDia] = leia.nextLine();
			System.out.print("Continua(S/N)?");
			op = leia.next().toUpperCase().charAt(0);
			
		}while(op=='S');
		
		System.out.print("AGENDA");
		for(int dia = 0; dia < 31; dia++) {
			for(int hora = 0; hora < 24; hora++) {
				System.out.printf("DIA: %d - HORA: %d - EVENTO: %s\n",dia+1,hora,agenda[hora][dia]);
			}
		}
		

	}

}
