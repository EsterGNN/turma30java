/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
import java.util.*;
public class Lista3Ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int i, num, quantidadePares = 0, quantidadeImpares = 0;
		
		for(i = 1; i <= 10; i++) {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
			if(num > 0) {
				if(num % 2 == 0 ) {
					quantidadePares += 1;
				}else {
					quantidadeImpares += 1;
				}
			}
			else {
				System.out.println("Número inválido. Na próxima informe um número inteiro positivo e diferente de 0.");
			}
		}
		
		System.out.printf("Dentre os números digitados válidos, %d são pares e %d são ímpares.",quantidadePares,quantidadeImpares);

	}

}
