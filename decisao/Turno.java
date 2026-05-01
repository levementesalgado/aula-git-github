import java.util.Scanner;

public class Turno {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		String turno;

		System.out.print("Informe o turno (M - matutino, V - vespertino, N - noturno): ");
		turno = ler.nextLine();

		if (turno.equalsIgnoreCase("M")) {
			System.out.println("Bom Dia!");
		} else if (turno.equalsIgnoreCase("V")) {
			System.out.println("Boa Tarde!");
		} else if (turno.equalsIgnoreCase("N")) {
			System.out.println("Boa Noite!");
		} else {
			System.out.println("Valor Inválido!");
		}

		ler.close();
	}
}
