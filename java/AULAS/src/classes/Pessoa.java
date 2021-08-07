package classes;

public class Pessoa {

	private String nome;
	private int anoNascimento;
	private String cpf;
	private char pronome; //M,F,E
	private boolean ativo;
	
	
	//CONSTRUTORES (mesmo nome da classe)
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	
	
	
	
	public void mostrarIdade() {
		System.out.print(2021-this.anoNascimento);
	}
	
	public int calcIdade(int anoAtual) {
		int valor;
		valor = anoAtual - anoNascimento;
		return valor;
	}
}
