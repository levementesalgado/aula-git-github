package enums;

public class PrincipalRoupa {
	public static void main (String[] args) {
		Roupa marca = Roupa.ZARA;

		System.out.println("Marca atribuída: " + marca.name());

		System.out.println("----- TODAS AS MARCAS -----");

		int i;

		for (i = 0; i < Roupa.values().length; i++) {
			System.out.println(Roupa.values()[i].name());
		}
	}
}
