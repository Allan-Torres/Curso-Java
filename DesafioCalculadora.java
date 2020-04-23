package desafio;

import java.util.Scanner;


public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Informe o numero: ");
		String valor1 = entrada.next().replace(",", ".");
		
		
		System.out.println("Informe o numero: ");
		String valor2 = entrada.next().replace(",", ".");
		
		
		System.out.println("Informe a operacao: ");
		String op = entrada.next();
		
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		
		double resultado = "+".contentEquals(op) ? num1 + num2 : 0;
		resultado = "-".contentEquals(op) ? num1 - num2 : resultado;
		resultado = "*".contentEquals(op) ? num1 * num2 : resultado;
		resultado = "/".contentEquals(op) ? num1 / num2 : resultado;
		resultado = "%".contentEquals(op) ? num1 % num2 : resultado;
		
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
	
		entrada.close();
		
	}

}