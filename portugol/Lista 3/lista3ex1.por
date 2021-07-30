programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		inteiro x = 1, y = 20
		real salario, salarioTotal = 0.0, filhos, filhosTotal = 0.0, maiorSalario = 0.0, pessoasSalario100 = 0.0
		real mediaSalario, mediaFilhos, percentualPessoas
		
		para(x; x <= y; x++){
			escreva("HABITANTE ", x)
			escreva("\nInforme o salário:")
			leia(salario)
			escreva("Informe a quantidade de filhos:")
			leia(filhos)
			//CÁLCULOS
			//Soma dos salários
			salarioTotal = salarioTotal + salario
			//Soma dos filhos
			filhosTotal = filhosTotal + filhos
			//Encontrando o maior salário
			se(salario > maiorSalario){
				maiorSalario = salario
			}
			//Quantidade de pessoas com salário até 100
			se(salario <= 100){
				pessoasSalario100 = pessoasSalario100 + 1
			}
		}
		//Cálculo da Média dos Salários 
		mediaSalario = salarioTotal/y
		//Cálculo da Média de Filhos
		mediaFilhos = filhosTotal/y
		//Cálculo do percentual de pessoas com salário até 100
		percentualPessoas =  (pessoasSalario100*100)/y

		//Saída de Dados
		escreva("\nMédia dos salários: ", mat.arredondar(mediaSalario,2))
		escreva("\nMédia de filhos: ", mat.arredondar(mediaFilhos,2))
		escreva("\nMaior salário encontrado: ", mat.arredondar(maiorSalario,2))
		escreva("\nPorcentagem de pessoas com salário até 100: ", mat.arredondar(percentualPessoas,2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1260; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */