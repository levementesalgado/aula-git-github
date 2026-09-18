public class Aviao {
	String marca;
	String modelo;
	int assentos;
	int ano;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void ligar() {
		System.out.println("O avião está ligado.");
	}

	public void decolar() {
		System.out.println("O avião está decolando.");
	}

	public void pousar() {
		System.out.println("O avião está pousando.");
	}

	public void acelerar() {
		System.out.println("O avião está acelerando.");
	}
}
