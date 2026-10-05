package classeabstrata;

public class ObjetosAnimal {
	public static void main (String[] args) {
		Animal lobo = new Lobo();
		Animal leao = new Leao();
		Animal tigre = new Tigre();
		Animal cachorro = new Cachorro();
		Animal gato = new Gato();

		lobo.setNome("Tarzan");
		lobo.setSexo("Macho");
		lobo.setRaca("Lobo cinzento");

		leao.setNome("Simba");
		leao.setSexo("Macho");
		leao.setRaca("Leão africano");

		tigre.setNome("Tony");
		tigre.setSexo("Macho");
		tigre.setRaca("Tigre de bengala");

		cachorro.setNome("Rex");
		cachorro.setSexo("Macho");
		cachorro.setRaca("Labrador");

		gato.setNome("Mimi");
		gato.setSexo("Fêmea");
		gato.setRaca("Sem raça definida");

		Animal [] animais = { lobo, leao, tigre, cachorro, gato };
		int i;

		for (i = 0; i < animais.length; i++) {
			System.out.println("----- " + animais[i].getNome() + " -----");
			System.out.println(animais[i].getSexo());
			System.out.println(animais[i].getRaca());
			animais[i].dormir();
			animais[i].caminhar();
			animais[i].correr();
			animais[i].emitirSom();
		}
	}
}
