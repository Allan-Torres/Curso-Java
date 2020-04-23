package desafio;

import java.util.Scanner;

public class DesafioEquacao2Grau {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Equação: ax² + bx + c = 0");
		
		System.out.println("Informe o valor de A: ");
		double a = entrada.nextDouble();
		
		System.out.println("Informe o valor de B: ");
		double b = entrada.nextDouble();
		
		System.out.println("Informe o valor de C: ");
		double c = entrada.nextDouble();
		
		System.out.printf("\nSua equação é: %.0fx² + %.0fx + %.0f = 0\n\n", a, b, c);
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		double x1 = (- b + Math.sqrt(delta)) / (2 * a); 
		
		double x2 = (- b - Math.sqrt(delta)) / (2 * a); 
		
		System.out.println("O valor de Delta e: \n" + delta);
		
		System.out.println("O x1 da equacao 1 e: \n" + x1);
		
		System.out.println("O x2 da equacao 2 e: " + x2);
		
		entrada.close();
		
	}

}