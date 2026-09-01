package aula04;

public class Pessoa {
	String nome;
	String sexo;
	int cpf;
	int idade;
	double peso;
	double altura;
	
	public void andar() {
		System.out.println(nome + " está andando.");
	}
	
	public void correr() {
		System.out.println(nome + " está correndo.");
	}
	
	public void falar() {
		System.out.println(nome + " está falando.");
	}
	
	public String toString() {
		return "Nome " + nome + "\nSexo: " + sexo + "\nCpf: " + cpf + "\nIdade: " + idade + "\nPeso: " + peso + "\nAltura: " + altura;
	}
}
