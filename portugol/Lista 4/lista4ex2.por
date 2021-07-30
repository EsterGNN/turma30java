programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		const inteiro n = 10
		inteiro vetor[n], i, maiorValor = 0, contador = 0
		real soma = 0.0, media

		//Definindo os lançamentos, somando seus valores e encontrando o maior dos valores
		para(i = 0; i<n; i++){
			vetor[i] = Util.sorteia(1,6)
			soma += vetor[i]
			se(vetor[i] > maiorValor){
				maiorValor = vetor[i]
			}
		}
		//Calculando quantas vezes o maior valor apareceu
		para(i = 0; i<n; i++){
			se(vetor[i] == maiorValor){
				contador += 1
			}
		}
		//Media dos valores obtidos nos lançamentos
		media = soma/n
		//Printando os lançamentos, a média, o maior valor e quantas vezes apareceu
		para(i = 0; i<n; i++){
			escreva(i+1,"º lançamento: ",vetor[i],"\n")
		}
		escreva("Media dos valores obtidos: ", media)
		escreva("\nO maior valor obtido nos lançamentos foi ",maiorValor," - apareceu ",contador," vez(es).")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 888; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */