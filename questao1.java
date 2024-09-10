package treinoJava;
import java.util.Scanner;
	
public class questao1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int option;
		
		System.out.println("Quer poder converter graus Celsius em outras temperaturas?");
		System.out.println("Escreva aqui a temperatura em Celsius: ");
		double celsius = teclado.nextDouble();
		
		do {
			System.out.println();
			System.out.println("Agora escolha entre essas temperaturas para fazer a conversão:");
			System.out.println("1- Fahrenheit");
			System.out.println("2- Kelvin");
			System.out.println("3- Reaumur");
			System.out.println("4- Rankine");
			option = teclado.nextInt();
			
			switch (option) {
			
				case 1:
					double celsiusParaFah = celsius * 1.8 + 32;
					System.out.printf("A temperatura de Celsius para Fahrenheit é de: %.2f%n ", celsiusParaFah);
					break;
					
				case 2:
					double celsiusParaKel = celsius + 273.15;
					System.out.printf("A temperatura de Celsius para Kelvin é de: %.2f%n ", celsiusParaKel);
					break;
				
				case 3:
					double celsiusParaRea = celsius * 0.8;
					System.out.printf("A temperatura de Celsius para Reaumur é de: %.2f%n ", celsiusParaRea);
					break;
					
				case 4:
					double celsiusParaRan = celsius * 1.8 + 32 + 459.67;
					System.out.printf("A temperatura de Celsius para Rankine é de: %.2f%n", celsiusParaRan);
					break;
					
				default:
					System.out.print("Opção incorreta, tente novamente!");
				}
				break;
			} while (option != 4);
		
		teclado.close();
	}
}