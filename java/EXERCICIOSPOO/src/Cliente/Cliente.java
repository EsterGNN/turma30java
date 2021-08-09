package Cliente;

public class Cliente {
	
	public String nome;
	public char op;
	public char opcaoProduto;
	
	
	public void boasVindas() {
		System.out.println("\nOlá, "+this.nome+". Seja bem vind"+this.op+".");
	}
	
	public void produtos() {
		System.out.println("\n**NOSSOS PRODUTOS**");
		System.out.println("1 - Doces frios");
		System.out.println("2 - Doces quentes");
	}
	
	public void escolhaProduto(char opcaoDeProdutoEscolhida) {
		if(opcaoProduto == '1') {
			System.out.println("\nPara doces frios, entre em contato com 01234-5678.");
		}
		if(opcaoProduto == '2') {
			System.out.println("\nPara doces quentes, entre em contato com 02020-2020.");
		}
	}

}
