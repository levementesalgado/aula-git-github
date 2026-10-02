package computador;

public class Gamer implements Computador {
	public void ligar() {
		System.out.println("O computador Gamer está ligado.");
	}

	public void reiniciar() {
		System.out.println("O computador Gamer está reiniciando.");
	}

	public void desligar() {
		System.out.println("O computador Gamer está desligado.");
	}

	public void carregandoSistema() {
		System.out.println("O computador Gamer está carregando o sistema.");
	}
}
