/*
 * Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
 */
import java.util.*;
public class Lista3Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i, num, quantidadePares = 0, quantidadeImpares = 0;
		
		for(i = 1; i <= 10; i++) {
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			
			if(num > 0) {
				if(num % 2 == 0 ) {
					quantidadePares += 1;
				}else {
					quantidadeImpares += 1;
				}
			}
			else {
				System.out.println("N�mero inv�lido. Na pr�xima informe um n�mero inteiro positivo e diferente de 0.");
			}
		}
		
		System.out.printf("Dentre os n�meros digitados v�lidos, %d s�o pares e %d s�o �mpares.",quantidadePares,quantidadeImpares);

	}

}
