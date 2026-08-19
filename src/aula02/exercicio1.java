package aula02;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String [] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nome completo: ");
		String nomeA = entrada.nextLine();
		
		String nome = Character.toUpperCase(nomeA.charAt(0)) + nomeA.substring(1);
		
		System.out.println("Sexo: ");
		String sexo = entrada.nextLine();
		
		System.out.println("Estado civil: ");
		String estadoCivil = entrada.nextLine();
		
		System.out.println("Quantidade de filhos: ");
		int filhos = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.println("Escolaridade: ");
		String escolaridade = entrada.nextLine();
		
		System.out.println("Renda mensal: ");
		double renda = entrada.nextDouble();
		
		System.out.printf("%s, sexo: %s. é %s. Tem %d filho(s), escolaridade: %s, e tem renda mensal de R$ %.2f.", nome, sexo, estadoCivil, filhos, escolaridade, renda);
	}
}
