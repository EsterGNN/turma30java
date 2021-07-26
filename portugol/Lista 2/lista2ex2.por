programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		cadeia C
		real N, salario, horasExecesso = 0, salarioExcesso = 0
		
		escreva("Olá, operário. Informe seu código de trabalho: ")
		leia(C)
		escreva("Informe a quantidade de horas trabalhadas: ")
		leia(N)
		
		se((N-50) <= 0){
			salario = N*10
			escreva("Código do operário: ", C,"\nO salário total é: ",  mat.arredondar(salario,2))
			escreva("\nNão há hora(s) em excesso, nem salário excedente.")
			escreva("\nHoras em excesso: ", horasExecesso)
			escreva("\nSalário excedente: ", salarioExcesso)
		}
		senao{
			horasExecesso = N - 50
			salarioExcesso = horasExecesso*20
			salario = (N*10) + salarioExcesso
			escreva("Código do operário: ", C,"\nO salário total é: ",  mat.arredondar(salario,2))
			escreva("\nHá hora(s) em excesso e salário excedente.")
			escreva("\nHoras em excesso: ", mat.arredondar(horasExecesso,2))
			escreva("\nSalário excedente: ", mat.arredondar(salarioExcesso,2))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 862; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */