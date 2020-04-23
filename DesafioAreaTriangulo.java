package desafio;

import java.util.Scanner;

public class DesafioAreaTriangulo {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe a base do triangulo: ");
		double b = entrada.nextDouble();
		
		System.out.println("Informe a altura do triangulo: ");
		double h = entrada.nextDouble();
		
		double a = b*h / 2;
		
		System.out.println("A area do triangulo e : " + a);
	
		entrada.close();
	}

}
