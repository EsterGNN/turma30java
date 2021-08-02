import java.util.Locale;
import java.util.Scanner;

public class ConversaoTemperatura {
	
	public static void main(String[] args){
		Scanner leia = new Scanner(System.in);
		Locale.setDefault(Locale.US); //Padrão estaduniense 
		String nome; 
		double temperaturaC, temperaturaF;
		
		System.out.print("Qual seu nome? ");
		nome = leia.nextLine();
		System.out.print("Informe a temperatura em graus Celsius: ");
		temperaturaC = leia.nextDouble();
		
		temperaturaF = (temperaturaC*1.8) + 32;
		System.out.println("A temperatura em Fahrenheit é "+temperaturaF+" °F"); 
	}

}
