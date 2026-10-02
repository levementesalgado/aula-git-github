package enums;

public class PrincipalCarro {
	public static void main (String[] args) {
		MarcaCarro marca = MarcaCarro.FIAT;

		System.out.println("Marca atribuída: " + marca.name());

		System.out.println("----- TODAS AS MARCAS -----");

		int i;

		for (i = 0; i < MarcaCarro.values().length; i++) {
			System.out.println(MarcaCarro.values()[i].name());
		}
	}
}
