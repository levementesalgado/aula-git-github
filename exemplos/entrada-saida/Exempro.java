import java.util.Scanner;
public class Exempro
{
    public static void main(String[] args){
    double a,b,som;
    Scanner ler = new Scanner (System.in);
    System.out.print("Escreva o numero 1:\n");
    a = ler.nextDouble();
    System.out.print("Escreva o numero 2:\n");
    b = ler.nextDouble();
    som = a+b;
    System.out.println("O resultado da sua soma é: "+ som);
    }
}
