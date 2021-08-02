import java.util.Scanner;

public class Lista1Ex8 {

	public static void main() {
		Scanner ler = new Scanner(System.in);
		double custoFabrica, custoConsumidor, distribuidor, impostos;
		
		System.out.print("Informe o custo da fábrica: ");
		custoFabrica = ler.nextDouble();
		
		distribuidor = 0.28*custoFabrica;
		impostos = 0.45*custoFabrica;
		
		custoConsumidor = custoFabrica + distribuidor + impostos;
		System.out.println("O custo do consumidor é "+custoConsumidor);
		
	}
}
