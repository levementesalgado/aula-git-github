import java.util.Scanner;

public class Calculadora {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		double a;
		double b;
		double resultado = 0;
		char operador;
		boolean operacaoValida = true;

		System.out.print("Informe o 1º valor: ");
		a = ler.nextDouble();
		System.out.print("Informe o 2º valor: ");
		b = ler.nextDouble();
		System.out.print("Informe o operador (+ - * /): ");
		operador = ler.next().charAt(0);

		switch (operador) {
			case '+':
				resultado = a + b;
				break;
			case '-':
				resultado = a - b;
				break;
			case '*':
				resultado = a * b;
				break;
			case '/':
				if (b == 0) {
					System.out.println("Erro: divisão por zero");
					operacaoValida = false;
				} else {
					resultado = a / b;
				}
				break;
			default:
				System.out.println("Operador inválido");
				operacaoValida = false;
		}

		if (operacaoValida) {
			System.out.println("Resultado: " + resultado);
		}

		ler.close();
	}
}
