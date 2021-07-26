programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real P, E, M
		
		escreva("Informe o peso (P) em kg de tomates de hoje: ")
		leia(P)


		se((P-50) <= 0){
			escreva("Não há quilo excedente hoje.")
			escreva("\nP = ", P," kg. \nE = 0 kg. \nM = 0 reais.")
		}
		senao{
			E = P - 50
			M = E*4
			escreva("Há quilo(s) excedente(s) hoje.")
			escreva("\nP = ", P," kg pesados. \nE = ", mat.arredondar(E,2)," kg de excesso. \nM = ", mat.arredondar(M,2)," reais de multa.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 471; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */