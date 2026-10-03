import java.util.Scanner;
public class Exempro2
{
    public static void main(String[] args){
    double a,b,som, sub, div, mul;
    Scanner ler = new Scanner (System.in);
    System.out.print("Escreva o numero 1: ");
    a = ler.nextDouble();
    System.out.print("Escreva o numero 2: ");
    b = ler.nextDouble();
    som = a+b;
    sub = a-b;
    div = a/b;
    mul = a*b;
    System.out.print("O resultado da sua soma é: " + som + "\nDa sua subtração é: " + sub + "\nDa sua divisão: " + div + "\nDa sua multiplicação: " + mul);
    System.out.println();

    }
}
