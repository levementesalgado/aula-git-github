import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double soma = 0, num;
        int i;

        for (i = 1; i <= 5; i++) {
            System.out.print("Informe o " + i + "º número: ");
            num = ler.nextDouble();
            soma = soma + num;
        }

        double media = soma / 5;
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);
        ler.close();
    }
}
