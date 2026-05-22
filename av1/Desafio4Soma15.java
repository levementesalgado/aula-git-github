import java.util.Scanner;

public class Desafio4Soma15 {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero;
		int soma = 0;
		int i;

		for (i = 1; i <= 15; i++) {
			System.out.print("Informe o " + i + "º número: ");
			numero = ler.nextInt();
			soma = soma + numero;
		}

		System.out.println("A soma dos 15 elementos é: " + soma);

		ler.close();
	}
}
