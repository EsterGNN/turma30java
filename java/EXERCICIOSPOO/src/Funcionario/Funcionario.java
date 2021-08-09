package Funcionario;

public class Funcionario {
	
	private String nome;
	private String cod;
	public String horaEntrada;
	public String horaSaida;
	
	public Funcionario(String nomeFuncionario, String codigoRegistro) {
		this.nome = nomeFuncionario;
		this.cod = codigoRegistro;
	}
	
	public void trabalho(char status, String hora) {
		if(status == 'E') {
			System.out.println(this.nome+" (COD: "+this.cod+") entrou �s "+hora+" e est� trabalhando.");
		}
		if(status == 'S') {
			System.out.println(this.nome+" (COD: "+this.cod+") saiu �s "+hora+" e est� fora do hor�rio de trabalho.");
		}
	}

}
