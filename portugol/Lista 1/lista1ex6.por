programa{
	
	inclua biblioteca Matematica --> mat
	funcao inicio(){

		//variaveis
		real X1, Y1, X2, Y2, distancia

		escreva("Informe as coordendas do primeiro ponto: \nX: ")
		leia(X1)
		escreva("Y:")
		leia(Y1)
		escreva("Informe as coordendas do segundo ponto: \nX: ")
		leia(X2)
		escreva("Y:")
		leia(Y2)

		// OBS: quadrado de x --> mat.potencia(x,2)
		distancia = mat.raiz((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1), 2.0) 

		escreva("Distância entre os pontos: ", distancia)
	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 323; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */