package aula02;

import java.util.Scanner;

public class EntradaDeDados {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Idade: ");
		int idade = entrada.nextInt();
		
		entrada.nextLine(); // limpeza de buffer
		
		System.out.println("Nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Peso: ");
		double peso = entrada.nextDouble();
		
		System.out.printf("%s tem %d anos e %.2f kg.", nome, idade, peso);
	}
}
