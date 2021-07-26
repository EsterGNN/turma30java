programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real num1, num2, num3, num4
		
		escreva("Informe os quatro números. \n1º número: ")
		leia(num1)
		escreva("2º número: ")
		leia(num2)
		escreva("3º número: ")
		leia(num3)
		escreva("4º número: ")
		leia(num4)

		// OBS: quadrado de x --> mat.potencia(x,2)
		se((num3*num3) >= 1000){
			escreva("O quadrado de ", num3," é ", (num3*num3),", ou seja, igual ou maior do que 1000.")
		}
		senao{
			escreva("O quadrado de ", num1," é ", mat.potencia(num1,2.0))
			escreva("\nO quadrado de ", num2," é ", mat.potencia(num2,2.0))
			escreva("\nO quadrado de ", num3," é ", mat.potencia(num3,2.0))
			escreva("\nO quadrado de ", num3," é ", mat.potencia(num4,2.0))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 109; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */