import java.util.Scanner;

public class AtividadeVetor {

	public static void main (String[] args) {
		    Scanner ler = new Scanner(System.in);
        String[] nomes = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = ler.nextLine();
        }            
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + nomes[i]);
        }
         ler.close();
	}
}

