import java.util.Scanner;

public class Desafio2AreaTriangulo {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		double base;
		double altura;
		double area;

		System.out.print("Informe a base do triângulo: ");
		base = ler.nextDouble();
		System.out.print("Informe a altura do triângulo: ");
		altura = ler.nextDouble();

		area = (base * altura) / 2;

		System.out.println("A área do triângulo é: " + area);

		ler.close();
	}
}
