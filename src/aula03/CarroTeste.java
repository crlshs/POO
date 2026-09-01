package aula03;

import java.util.Scanner;
public class CarroTeste {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Carro carro1 = new Carro();
		
		// atribuindo valores para cada carro
		carro1.modelo = "Q8";
		carro1.marca = "Audi";
		carro1.ano = 2020;
		carro1.placa = "ABC-1234";
		carro1.cor = "Preto";
	
		while (true) {
			System.out.println("\nDigite o comando:\n1 - ligar\n2 - desligar\n3 - acelerar\n4 - frear\n0 - sair");
			int n = entrada.nextInt();
			
			if (n == 1) {
				carro1.ligar();
			}
			if (n == 2) {
				carro1.desligar();
			}
			if (n == 3) {
				carro1.acelerar(40);
			}
			if (n == 4) {
				carro1.frear(25);
			}
			if (n == 0) {
				break;
			}
		}	
		entrada.close();
	}
}
