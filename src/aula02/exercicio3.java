package aula02;

// dar um desconto de 10% caso o valor da compra seja maior que 50, se nao, um desconto de 5%
import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Valor da compra: ");
		double valor = entrada.nextDouble();
		
		double desconto = (valor >= 50) ? 0.1 : 0.05;
		double valorNovo = (valor - valor*desconto);

		System.out.printf("Valor original da compra:R$%.2f\n", valor);
		
		System.out.printf("Valor da compra com desconto: R$%.2f",valorNovo);
	}
}
