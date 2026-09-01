package aula04;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		pessoa1.nome = "Boleslau";
		pessoa1.sexo = "Masculino";
		pessoa1.cpf = 999888777;
		pessoa1.idade = 56;
		pessoa1.peso = 75.3;
		pessoa1.altura = 1.70;
		
		pessoa2.nome = "Estanislau";
		pessoa2.sexo = "Masculino";
		pessoa2.cpf = 123456789;
		pessoa2.idade = 41;
		pessoa2.peso = 80.1;
		pessoa2.altura = 1.71;
		
		pessoa3.nome = "Miroslau";
		pessoa3.sexo = "Masculino";
		pessoa3.cpf = 987654321;
		pessoa3.idade = 50;
		pessoa3.peso = 77.6;
		pessoa3.altura = 1.66;

		pessoa1.andar();
		pessoa3.falar();
		pessoa2.falar();
		pessoa2.correr();
		pessoa3.andar();
		pessoa1.correr();
		
		System.out.println("\n" + pessoa1);
		System.out.println("\n" +pessoa2);
		System.out.println("\n" +pessoa3);
	}
}
