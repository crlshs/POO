package aula01;

public class saidaDados {
	public static void main(String [] args) {
		String nome = "Carlos";
		int idade = 95;
		double peso = 74.3;
		
		System.out.println("Universidade Tecnologica Federal do Paraná");
		System.out.println("Programacao orientada a objetos\n");
		
		System.out.printf("Universidade Tecnologica Federal do Paraná");
		System.out.printf("Programacao orientada a objetos\n");
		
		System.out.print("Universidade Tecnologica Federal do Paraná");
		System.out.print("Programacao orientada a objetos\n");
		
		System.out.println(nome + " tem " + idade + " anos e " + peso + "kg.");
		System.out.print(nome + " tem " + idade + " anos e " + peso + "kg.");
		System.out.printf("%s tem %d anos e %.1f kg.\n", nome, idade, peso);
	}
}
