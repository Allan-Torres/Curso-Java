package desafio;

import java.util.Scanner;

public class DesafioImc {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ola, digite seu nome: ");
		String nome = entrada.nextLine().toUpperCase();
		
		System.out.println(nome + ", por favor insira o seu peso: ");
		String p = entrada.next().replace(",", ".");
		
		System.out.println("Agora, insira a sua altura: ");
		String a = entrada.next().replace(",", ".");
		
		double peso = Double.parseDouble(p);
		double altura = Double.parseDouble(a);
		
		double imc = peso / Math.pow(altura, 2);
		
		System.out.printf("Ola %s, o seu IMC e: %.2f ", nome, imc);		
		
		entrada.close();
		
	}

}
