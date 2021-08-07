import java.util.Scanner;

public class CopinhaVetor {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nomeTimes[] = {"SANTOS     ","SPFC     ","PALMEIRAS","CORINTHIANS"};
		String codTimes[] = new String[4];
		int pontosTimes[] = new int[4];
		char op;
		String auxCod;
		
		for(int x = 0; x < nomeTimes.length; x++) {
			codTimes[x] = "CPF-0"+(x+1);
		}
	
		
		for(int x = 1; x <= 3; x++) {
			System.out.println("RODADA"+(x));
			for(int y = 0; y < codTimes.length; y++) {
				System.out.print(nomeTimes[y]+" G (ganhou), P (perdeu) ou E (empatou)?");
				op = leia.next().toUpperCase().charAt(0);
				if(op == 'G') {
					pontosTimes[y] = pontosTimes[y]+3;
				}
				else if(op == 'E') {
					pontosTimes[y] += 1;
				}
				else if(op == 'P') {
					pontosTimes[y] += 0;
				}
				else {
					System.out.println("Não foi passado um valor correto. Vai ficar zero!");
				}
			}
		}
		
		System.out.println("**APÓS 3 RODADAS**");
		System.out.println("COD\tTIME     \tPONTOS");
		for(int x = 0; x < codTimes.length; x++) {
			System.out.printf("%s\t%s\t%d\n",codTimes[x],nomeTimes[x],pontosTimes[x]);
		}
		
		System.out.println();
		System.out.print("Informe o código do time que deseja selecionar: ");
		auxCod = leia.next().toUpperCase();
		
		System.out.println("COD\tTIME     \tPONTOS");
		for(int x = 0; x < codTimes.length; x++) {
			if(auxCod.equals(codTimes[x])) {
				System.out.printf("%s\t%s\t%d\n",codTimes[x],nomeTimes[x],pontosTimes[x]);
			}
		}

	}

}
