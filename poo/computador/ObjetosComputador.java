package computador;

public class ObjetosComputador {
	public static void main (String[] args) {
		Computador gamer = new Gamer();
		Computador home = new Home();

		System.out.println("----- GAMER -----");
		gamer.ligar();
		gamer.carregandoSistema();
		gamer.reiniciar();
		gamer.desligar();

		System.out.println("----- HOME -----");
		home.ligar();
		home.carregandoSistema();
		home.reiniciar();
		home.desligar();
	}
}
