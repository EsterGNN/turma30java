programa{
	
	funcao inicio(){
		real custoFabrica, custoConsumidor, distribuidor, impostos
		
		escreva("Informe o custo de fábrica: ")
		leia(custoFabrica)
		
		distribuidor = 0.28*custoFabrica
		impostos = 0.45*custoFabrica

		custoConsumidor = custoFabrica + distribuidor + impostos

		escreva("O custo do consumidor é ", custoConsumidor)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 290; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */