import java.util.Scanner;

public class Triangulo {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		double a;
		double b;
		double c;

		System.out.print("Informe o 1º lado: ");
		a = ler.nextDouble();
		System.out.print("Informe o 2º lado: ");
		b = ler.nextDouble();
		System.out.print("Informe o 3º lado: ");
		c = ler.nextDouble();

		if (a == b && b == c) {
			System.out.println("Triângulo Equilátero");
		} else if (a == b || a == c || b == c) {
			System.out.println("Triângulo Isósceles");
		} else {
			System.out.println("Triângulo Escaleno");
		}

		ler.close();
	}
}
