programa
{
	
	funcao inicio()
	{
		const inteiro n = 4
		inteiro i
		cadeia alunos[n]
		inteiro notas[n]

		para(i = 0; i < n; i++){
			escreva("Nome do aluno: ")
			leia(alunos[i])
			escreva("Informe a nota: ")
			leia(notas[i])
			limpa()
		}

		para(i = 0; i < n; i++){
			se(notas[i] < 5){
				escreva("Nome: ", alunos[i],". Nota: ",notas[i],". Ainda não, se esforce mais!\n")
			}
			senao{
				escreva("Nome: ", alunos[i],". Nota: ",notas[i],". Parabéns, continue assim!\n")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 482; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */