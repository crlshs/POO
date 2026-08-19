package aula02;

public class OperadorTernario {
	public static void main(String[] args) {
		int idade = 20;
		
		if (idade >= 18) {
			System.out.println("é maior de idade.");
		} else {
			System.out.println("é menor de idade.");
		}

		// operador ternario
		idade = 8;
		// variavel = (condicao) ? valor se verdade : valor se falso
		String mensagem = (idade >= 18) ? "maior" : "menor";
		System.out.println("é " + mensagem + " de idade.");
	}
	
}
