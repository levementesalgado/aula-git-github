import java.util.Scanner;

public class MaiorNumero {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		double a;
		double b;
		double c;
		double maior;

		System.out.print("Informe o 1º número: ");
		a = ler.nextDouble();
		System.out.print("Informe o 2º número: ");
		b = ler.nextDouble();
		System.out.print("Informe o 3º número: ");
		c = ler.nextDouble();

		maior = a;

		if (b > maior) {
			maior = b;
		}

		if (c > maior) {
			maior = c;
		}

		System.out.println("O maior número é: " + maior);

		ler.close();
	}
}
