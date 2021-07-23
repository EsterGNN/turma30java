programa{
	
	funcao inicio(){
		real A, B, C, D, E, F, x, y
		
		escreva("Vamos resolver o sistema! Informe os coeficientes a, b, c, d, e, f. \na:")
		leia(A)
		escreva("b:")
		leia(B)
		escreva("c:")
		leia(C)
		escreva("d:")
		leia(D)
		escreva("e:")
		leia(E)
		escreva("f:")
		leia(F)

		x = ((C*E)-(B*F))/((A*E)-(B*D))
		y = ((A*F)-(C*D))/((A*E)-(B*D))

		escreva("O valor de x é: ", x,"\nO valor de y é: ", y)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */