import java.util.Scanner;

public class NumeroNegativo {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;

		System.out.print("Informe um número inteiro: ");
		numero = ler.nextInt();

		if (numero < 0) {
			System.out.println("Erro: o número informado é negativo");
		} else {
			System.out.println("Número aceito: " + numero);
		}

		ler.close();
	}
}
