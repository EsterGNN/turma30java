package Heranca;

public class Loja {
	//ATRIBUTOS
	private String nomeProduto;
	private String codigoProduto;
	private double valorProduto;
	private int estoque;
	
	//CONSTRUTORES
	public Loja(String nomeProduto, String codigoProduto, double valorProduto, int estoque) {
		super();
		this.nomeProduto = nomeProduto;
		this.codigoProduto = codigoProduto;
		this.valorProduto = valorProduto;
		this.estoque = estoque;
	}

	
	//ENCAPSULAMENTO
	
	public String getNomeProduto() {
		return nomeProduto;
	}

	/*
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	*/

	public String getCodigoProduto() {
		return codigoProduto;
	}

	/*
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	*/

	public double getValorProduto() {
		return valorProduto;
	}

	/*
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}
	*/

	public int getEstoque() {
		return estoque;
	}

	/*
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	*/
	
	//MÉTODOS
	public void alteraEstoque(int quantidade) {
		this.estoque -= quantidade;
	}
	
}
