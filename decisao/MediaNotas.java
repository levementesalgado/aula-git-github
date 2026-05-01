import java.util.Scanner;

public class MediaNotas {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota;
		double soma = 0;
		double media;
		int i;

		for (i = 1; i <= 5; i++) {
			System.out.print("Informe a " + i + "ª nota: ");
			nota = ler.nextDouble();
			soma = soma + nota;
		}

		media = soma / 5;

		System.out.println("Média: " + media);

		if (media >= 6) {
			System.out.println("Aprovado");
		} else {
			System.out.println("Reprovado");
		}

		ler.close();
	}
}
