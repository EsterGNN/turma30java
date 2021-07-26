programa{
	
	inclua biblioteca Matematica --> mat
	funcao inicio(){

		//variaveis
		real A, B, C, R, S, D

		escreva("INFORME O PRIMEIRO VALOR (A): ")
		leia(A)
		escreva("INFORME O SEGUNDO VALOR (B): ")
		leia(B)
		escreva("INFORME O TERCEIRO VALOR (C): ")
		leia(C)

		R = mat.potencia((A+B),2)
		S = mat.potencia((B+C),2)
		D = (R+S)/2

		escreva("Resultado: ", D)
	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 325; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */