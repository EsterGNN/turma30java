programa{
	
	funcao inicio(){

		//variaveis
		inteiro totalSegundos, segundos, minutos, horas

		escreva("Qual o tempo de duração do evento (em segundos)? ")
		leia(totalSegundos)

		horas = totalSegundos/3600
		minutos = (totalSegundos % 3600)/60

		segundos = ((totalSegundos % 3600) % 60)

		escreva("O evento durou ", horas," hora(s), ", minutos," minuto(s) e ", segundos," segundo(s).")

	}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 399; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */