package veiculo;

public class ObjetosVeiculo {
	public static void main (String[] args) {
		Veiculo ferrari1 = new Ferrari();
		Veiculo ferrari2 = new Ferrari();

		System.out.println("----- OBJETO 1 -----");
		ferrari1.ligar();
		ferrari1.acelerar();
		ferrari1.frear();
		ferrari1.desligar();

		System.out.println("----- OBJETO 2 -----");
		ferrari2.ligar();
		ferrari2.manobrar();
		ferrari2.engatar();
		ferrari2.desligar();
	}
}
