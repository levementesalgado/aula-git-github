package computador;

public class Home implements Computador {
	public void ligar() {
		System.out.println("O computador Home está ligado.");
	}

	public void reiniciar() {
		System.out.println("O computador Home está reiniciando.");
	}

	public void desligar() {
		System.out.println("O computador Home está desligado.");
	}

	public void carregandoSistema() {
		System.out.println("O computador Home está carregando o sistema.");
	}
}
