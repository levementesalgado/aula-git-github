import java.util.Scanner;

public class ParesImparesWhile {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num;
        int soma = 0;
        int pares = 0;
        int impares = 0;
        int i = 1;

        while (i <= 10) {
            System.out.print("Informe o " + i + "º número inteiro: ");
            num = ler.nextInt();
            soma = soma + num;
            if (num % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }
            i++;
        }

        System.out.println("A soma é: " + soma);
        System.out.println("Quantidade de pares: " + pares);
        System.out.println("Quantidade de ímpares: " + impares);
        ler.close();
    }
}
