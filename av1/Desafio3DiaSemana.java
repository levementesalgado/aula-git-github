import java.util.Scanner;

public class Desafio3DiaSemana {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int dia;
		String nomeDoDia;

		System.out.print("Informe o dia da semana (1 a 7): ");
		dia = ler.nextInt();

		switch (dia) {
			case 1:
				nomeDoDia = "Domingo";
				break;
			case 2:
				nomeDoDia = "Segunda";
				break;
			case 3:
				nomeDoDia = "Terça";
				break;
			case 4:
				nomeDoDia = "Quarta";
				break;
			case 5:
				nomeDoDia = "Quinta";
				break;
			case 6:
				nomeDoDia = "Sexta";
				break;
			case 7:
				nomeDoDia = "Sábado";
				break;
			default:
				nomeDoDia = "Dia Inválido";
		}

		System.out.println(nomeDoDia);

		ler.close();
	}
}
