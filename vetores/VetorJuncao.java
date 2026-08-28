import java.util.Scanner;

public class VetorJuncao {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int [] a = new int[5];
		int [] b = new int[5];
		int [] c = new int[10];
		int i;

		for (i = 0; i < 5; i++) {
			System.out.print("Informe o " + (i + 1) + "º número do vetor A: ");
			a[i] = ler.nextInt();
		}

		for (i = 0; i < 5; i++) {
			System.out.print("Informe o " + (i + 1) + "º número do vetor B: ");
			b[i] = ler.nextInt();
		}

		for (i = 0; i < 5; i++) {
			c[i] = a[i];
			c[i + 5] = b[i];
		}

		System.out.println("Vetor C (A + B):");
		for (i = 0; i < 10; i++) {
			System.out.println("Posição " + i + ": " + c[i]);
		}

		ler.close();
	}
}
