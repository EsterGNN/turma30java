package entities;

public class Terceiro extends Funcionario{
	//ATRIBUTOS
	private double adicional;

	//CONSTRUTORES
	public Terceiro(String matricula, int horasTrabalhadas, double valorPorHora, double adicional) {
		super(matricula, horasTrabalhadas, valorPorHora);
		this.adicional = adicional;
	}
	
	//ENCAPSULAMENTO
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	//MÉTODO
	@Override
	public double calculoSalario(){
		return ((horasTrabalhadas*valorPorHora)+this.adicional); //NESSE CASO COLA PROTECTED NESSAS VARIÁVEIS NA SUPERCLASSE 
		//return ((super.getHorasTrabalhadas()*super.getValorPorHora())+this.adicional);
	}
	
}
