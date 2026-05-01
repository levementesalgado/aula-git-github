import java.util.Scanner;

public class LetraSexo {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		String letra;

		System.out.print("Informe a letra (F ou M): ");
		letra = ler.nextLine();

		if (letra.equalsIgnoreCase("F")) {
			System.out.println("Feminino");
		} else if (letra.equalsIgnoreCase("M")) {
			System.out.println("Masculino");
		} else {
			System.out.println("Valor Inválido!");
		}

		ler.close();
	}
}
