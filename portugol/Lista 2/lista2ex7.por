programa
{
	
	funcao inicio()
	{
		real base, altura, area
		
		escreva("Sobre o triângulo, informe a medida da BASE: ")
		leia(base)
		escreva("Informa a medida da ALTURA: ")
		leia(altura)

		se((base > 0) e (altura > 0)){
			area = (base*altura)/2
			escreva("A área do triângulo é ", area)
		}
		senao se(base <= 0 e altura <= 0){
			escreva("As medidas informadas não são válidas.")
		}
		senao se(base <= 0){
			escreva("A base informada não é válida.")
		}
		senao{
			escreva("A altura informada não é válida.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 492; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */