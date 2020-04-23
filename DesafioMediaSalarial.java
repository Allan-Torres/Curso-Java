package desafio;

import java.util.Scanner;

public class DesafioMediaSalarial {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite seu salaro do primeiro mes: ");
		String mes1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu salaro do segundo mes: ");
		String mes2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite seu salaro do terceiro mes: ");
		String mes3 = entrada.nextLine().replace(",", ".");
		
		double num1 = Double.parseDouble(mes1);
		double num2 = Double.parseDouble(mes2);
		double num3 = Double.parseDouble(mes3);

		double soma = num1 + num2 + num3;
		
		System.out.println("A soma do salario e " + soma);
		System.out.println("A media do salario e " + soma / 3);

		entrada.close();
 
	}

}
