programa
{
	
	funcao inicio()
	{
		real indice
		
		escreva("Informe o índice de poluição: ")
		leia(indice)

		se((indice >= 0.05) e (indice <= 0.25)){
			escreva("O índice está dentro do aceitável.")	
		}
		senao se(indice < 0.4){
			escreva("O índice é ", indice," e as indústrias do grupo 1 devem parar a atividade.")	
		}
		senao se(indice < 0.5){
			escreva("O índice é ", indice," e as indústrias dos grupos 1 e 2 devem parar a atividade.")
		}
		senao{
			escreva("O índice é ", indice," e as indústrias dos grupos 1, 2 e 3 devem parar a atividade.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 465; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */