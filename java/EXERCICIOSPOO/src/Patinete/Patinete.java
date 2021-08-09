package Patinete;

public class Patinete {
	
	public char alugado;
	public String nomeAlugador;
	public double horaRetirada;
	public double horaEntrega;
	public double valorTotal;
	
	public void disponibilidade(char op) {
		if(op == 'S') {
			System.out.println("____O patinete está disponível para viagem____\n");
		}
		if(op == 'N') {
			System.out.println("\n\n____O patinete está sendo utilizado____");
		}
	}
	
	public void registro(String nome) {
		System.out.print("Alugado por: "+nome+"\n");
	}
	
	public double custoTotal(double entrega, double saida) {
		this.valorTotal = (entrega - saida)*15;
		return this.valorTotal;
	}

}
