package desafio;

import java.util.Scanner;

public class DesafioConversaoTemperatura {
	
	public static void main(String[] args) {
		
		// Celsius em Fahrenheit
		
		final int fator = 32; // constante
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o valor em Celsius para converter em Fahrenheit: ");
		double celsius = entrada.nextDouble();
		
		double fahrenheit = (celsius * 9/5) + fator;
		
		System.out.printf("O valor de %.0f °C convertido em Fahrenheit e %.0f\n\n", celsius, fahrenheit);
		
		
		// Fahrenheit em Celsius
		final int fator1 = 32; // constante
		final double multiplicador = 5.0 / 9.0; // constante		
		
		System.out.println("Informe o valor em Fahrenheit para ser convertido em Celsius: ");
		double valor = entrada.nextDouble();
		
		double celsius1 = (valor - fator1) * multiplicador;
		
		System.out.printf("O valor em Celsius e %.0f °C", celsius1); 
		
		entrada.close();
		
	} 

}
