programa
{
	
	funcao inicio()
	{
		inteiro idade
		
		escreva("Informe a idade: ")
		leia(idade)
		
		se((idade >= 5) e (idade <= 7)){
			escreva("Classificação: Infantil A.")
		}
		senao se((idade >= 8) e (idade <= 11)){
			escreva("Classificação: Infantil B.")
		}
		senao se((idade == 12) ou (idade == 13)){
			escreva("Classificação: Juvenil A.")
		}
		senao se((idade >= 14) e (idade <= 17)){
			escreva("Classificação: Juvenil B.")
		}
		senao se(idade >= 18){
			escreva("Classificação: Adulto.")
		}
		senao{
			escreva("Sem classificação.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 539; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */