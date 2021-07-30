programa
{
	
	funcao inicio()
	{
		real num, soma = 0.0, contador = 0.0, media
		
		escreva("Informe um valor: ")
		leia(num)

		enquanto(num >= 0){
			soma = soma + num
			contador += 1
			escreva("\nInforme um valor: ")
			leia(num)
		}

		media = soma/contador

		escreva("\nSomatório dos números: ", soma)
		escreva("\nMédia: ", media)
		escreva("\nQuantidade de operações: ", contador)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 359; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */