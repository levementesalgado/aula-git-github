import java.util.Scanner;

public class SomaOitenta {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		double a;
		double b;
		double c;
		double soma;

		System.out.print("Informe o 1º valor real: ");
		a = ler.nextDouble();
		System.out.print("Informe o 2º valor real: ");
		b = ler.nextDouble();
		System.out.print("Informe o 3º valor real: ");
		c = ler.nextDouble();

		soma = a + b + c;

		if (soma > 80) {
			System.out.println("A soma dos três valores é: " + soma);
		} else {
			System.out.println("A soma não ultrapassou o valor 80");
		}

		ler.close();
	}
}
