import java.util.Scanner;

public class Desafio1Operacoes {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		double a;
		double b;
		double soma;
		double sub;
		double mult;
		double div;

		System.out.print("Informe o valor de a: ");
		a = ler.nextDouble();
		System.out.print("Informe o valor de b: ");
		b = ler.nextDouble();

		soma = a + b;
		sub = a - b;
		mult = a * b;
		div = a / b;

		System.out.println("soma = " + soma);
		System.out.println("sub = " + sub);
		System.out.println("mult = " + mult);
		System.out.println("div = " + div);

		ler.close();
	}
}
