programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		const inteiro n = 3
		inteiro i, j
		real matriz[n][n], soma = 0.0, somaDiagonal = 0.0

		escreva("Informe os valores da matriz:\n")
		para(i = 0; i < n; i++){
			para(j = 0; j < n; j++){
				leia(matriz[i][j])
				//matriz[i][j] = Util.sorteia(0,100)
				soma += matriz[i][j]
				se(j == i){
					somaDiagonal += matriz[i][j] 
				}
			}
		}

		escreva("Matriz informada:\n")
		para(i = 0; i < n; i++){
			para(j = 0; j < n; j++){
				escreva(matriz[i][j]," ")
			}
			escreva("\n")
		}

		escreva("\nSoma de todos os seus valores: ", soma)
		escreva("\nSoma dos valores da diagonal principal: ", somaDiagonal)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 15; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */