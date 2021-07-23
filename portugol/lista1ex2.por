programa{
	
	funcao inicio(){

		//variaveis
		inteiro totalDias, anos, meses, dias

		escreva("Quantos dias de vida você tem? ")
		leia(totalDias)

		anos = totalDias/365
		meses = (totalDias % 365)/30
		dias = ((totalDias % 365) % 30)

		escreva("Você tem ", anos," ano(s), ", meses," mes(es) e ", dias, " dia(s).")

	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 292; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */