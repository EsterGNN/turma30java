programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		const inteiro m = 4, n = 6
		inteiro N1[m][n], N2[m][n], i, j, matrizSoma[m][n], matrizSubtracao[m][n]

		//escreva("Informe os valores da primeira matriz:\n")
		para(i = 0; i < m; i++){
			para(j = 0; j < n; j++){
				//leia(N1[i][j])
				N1[i][j] = Util.sorteia(0,100)
			}
		}
		limpa()
		
		//escreva("Informe os valores da segunda matriz:\n")
		para(i = 0; i < m; i++){
			para(j = 0; j < n; j++){
				//leia(N2[i][j])
				N2[i][j] = Util.sorteia(0,100)
			}
		}
		limpa()

		escreva("Primeira matriz:\n")
		para(i = 0; i < m; i++){
			para(j = 0; j < n; j++){
				escreva(N1[i][j]," ")
			}
			escreva("\n")
		}
		
		escreva("\nSegunda matriz:\n")
		para(i = 0; i < m; i++){
			para(j = 0; j < n; j++){
				escreva(N2[i][j]," ")
			}
			escreva("\n")
		}

		escreva("\nMatriz resultante da soma:\n")
		para(i = 0; i < m; i++){
			para(j = 0; j < n; j++){
				matrizSoma[i][j] = N1[i][j] + N2[i][j]
				escreva(matrizSoma[i][j]," ")
			}
			escreva("\n")
		}
		
		escreva("\nMatriz resultante da subtração:\n")
		para(i = 0; i < m; i++){
			para(j = 0; j < n; j++){
				matrizSubtracao[i][j] = N1[i][j] - N2[i][j]
				escreva(matrizSubtracao[i][j]," ")
			}
			escreva("\n")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1152; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */