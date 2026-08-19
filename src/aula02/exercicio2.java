package aula02;

// verificar qual é o maior valor entre 3 valores dados de entrada
import java.util.Scanner;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Valor 1: ");
		int a = entrada.nextInt();
		
		System.out.print("Valor 2: ");
		int b = entrada.nextInt();
		
		System.out.print("Valor 3: ");
		int c = entrada.nextInt();
		
//		int maior = (a >= b) ? a : b;
//		maior = (maior >= c) ? maior : c;
		int maior = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);

		System.out.println(maior);
	}
}
