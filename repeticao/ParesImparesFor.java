import java.util.Scanner;

public class ParesImparesFor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        int soma = 0;
        int pares = 0;
        int impares = 0;
        int i;

        for (i = 1; i <= 10; i++) {
            System.out.print("Informe o " + i + "º número inteiro: ");
            num = ler.nextInt();
            soma = soma + num;
            if (num % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }
        }

        System.out.println("A soma é: " + soma);
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
        ler.close();
    }
}
