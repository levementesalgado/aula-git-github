import java.util.Scanner;

public class MesSwitch {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int mes;
		String nomeDoMes;

		System.out.print("Informe o numero do mes (1 a 12): ");
		mes = ler.nextInt();

		switch (mes) {
			case 1:
				nomeDoMes = "Janeiro";
				break;
			case 2:
				nomeDoMes = "Fevereiro";
				break;
			case 3:
				nomeDoMes = "Março";
				break;
			case 4:
				nomeDoMes = "Abril";
				break;
			case 5:
				nomeDoMes = "Maio";
				break;
			case 6:
				nomeDoMes = "Junho";
				break;
			case 7:
				nomeDoMes = "Julho";
				break;
			case 8:
				nomeDoMes = "Agosto";
				break;
			case 9:
				nomeDoMes = "Setembro";
				break;
			case 10:
				nomeDoMes = "Outubro";
				break;
			case 11:
				nomeDoMes = "Novembro";
				break;
			case 12:
				nomeDoMes = "Dezembro";
				break;
			default:
				nomeDoMes = "Mês Inválido";
		}

		System.out.println(nomeDoMes);

		ler.close();
	}
}
