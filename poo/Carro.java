public class Carro {
	String marca;
	String modelo;
	String cor;
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

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public void ligar() {
		System.out.println("O carro está ligado.");
	}

	public void acelerar() {
		System.out.println("O carro está acelerando.");
	}

	public void frear() {
		System.out.println("O carro está freando.");
	}

	public void parar() {
		System.out.println("O carro está parado.");
	}
}
