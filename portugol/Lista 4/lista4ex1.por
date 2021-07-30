programa
{
	
	funcao inicio()
	{
		inteiro i 
		real pontos[5], maior = 0.0

		escreva("Informe as pontuações:\n")
		para(i = 0; i < 5; i++){
			leia(pontos[i])
			se(pontos[i] > maior){
				maior = pontos[i]
			}
		}
		escreva("Pontuações informadas:\n")
		para(i = 0; i < 5; i++){
			escreva(pontos[i], "   ")
		}
		escreva("\nMaior pontuação: ", maior)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 314; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */