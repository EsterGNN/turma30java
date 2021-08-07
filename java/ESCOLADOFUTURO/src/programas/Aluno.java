package programas;

public class Aluno {

	//ATRIBUTOS
	public String nome;
	public String matricula;
	public boolean status;
	public int nota;
	public int anoNascimento;
	
	
	//SOBRECARGA (mais do mesmo)
	//CONSTRUTORES
	//ENCAPSULAMENTO (segurança - getters and setters)
	//METODOS
	public void mostraIdade() {
		System.out.println("IDADE:"+(2021-this.anoNascimento)); //this: atributo da classe
	}
	public void mostraIdade(int anoAtual) {
		System.out.println("IDADE:"+(anoAtual-anoNascimento));
	}
	public void mostraIdade(int anoAtual, int anoNascimento) {
		System.out.println("IDADE:"+(anoAtual-anoNascimento));
	}
	
	
	//POLIMORFISMO
	//HERENÇA
	//ABSTRAÇÃO
	//DELEGAÇÃO
	//OVERRIDE (annotation)
}
