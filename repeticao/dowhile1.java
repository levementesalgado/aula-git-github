import java.util.Scanner;

public class dowhile1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double soma = 0, num;
        int i = 1;

        do {
            System.out.print("Informe o " + i + "º número: ");
            num = ler.nextDouble();
            soma = soma + num;
            i++;
        } while (i <= 5);

        double media = soma / 5;
        System.out.println("A soma é: " + soma);
        System.out.println("A média é: " + media);
        ler.close();
    }
}
