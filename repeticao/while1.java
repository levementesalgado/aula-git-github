import java.util.Scanner;

public class while1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double soma = 0, num;
        int i = 1;

        while (i <= 5) {
            System.out.print("Informe o " + i + "º número: ");
            num = ler.nextDouble();
            soma = soma + num;
            i++;
        }

        double media = soma / 5;
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);
        ler.close();
    }
}
