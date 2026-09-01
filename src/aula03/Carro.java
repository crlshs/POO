package aula03;

public class Carro {
	// atributos da classe carro
	String modelo;
	String marca;
	int ano;
	String placa;
	String cor;
	boolean ligado = false;
	Double velocidade = 0.0;

	// metodos da classe carro
	public void ligar() {
		System.out.println(marca + " " + modelo + " está ligado.");
		ligado = true;
	}

	public void desligar() {
		System.out.println(marca + " " + modelo + " está desligado.");
		ligado = false;
		velocidade = 0.0;
	}

	public void acelerar(double km) {
		if (velocidade < 200 && ligado) {
			System.out.println(marca + " " + modelo + " está acelerando.");
			velocidade += km;

		} 
		if (velocidade >= 200) {
			System.out.println(marca + " " + modelo + " atingiu a velocidade máxima");
		}
		else if (!ligado) {
			System.out.println(marca + " " + modelo + " está desligado.");
		}
		
		velocidade = Math.min(200, velocidade);
		System.out.println("Sua velocidade atual é: " + velocidade + " km/h.");
	}

	public void frear(double km) {
		if (velocidade > 0 && ligado) {
			System.out.println(marca + " " + modelo + " está freando.");
			velocidade -= km;
		} 
		
		else {
			System.out.println(marca + " " + modelo + " está parado.");
		}

		velocidade = Math.max(0, velocidade);
		System.out.println("Sua velocidade atual é: " + velocidade + " km/h.");
	}
}
