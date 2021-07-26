programa
{
	
	funcao inicio()
	{
		inteiro num
		
		escreva("Informe um número: ")
		leia(num)
		
		se(num < 0){
			num = num*(-1)
			se((num % 2) == 0){
				escreva("O número é negativo e par.")	
			}
			senao{
				escreva("O número é negativo e ímpar.")
			}
		}
		senao se(num > 0){
			se((num % 2) == 0){
				escreva("O número é positivo e par.")	
			}
			senao{
				escreva("O número é positivo e ímpar.")
			}
		}
		senao{
			escreva("O número 0 é neutro.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 467; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */