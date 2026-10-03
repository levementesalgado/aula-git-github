import java.util.Scanner;

public class NomeIdade{
      public static void main(String[] args){
      String nome;
      int idade;
      Scanner ler = new Scanner (System.in);
      System.out.print("Escreva se nome: ");
      nome = ler.nextLine();
      System.out.println("Escreva sua idade: ");
      idade = ler.nextInt();
      System.out.println("Nome: "+nome+" idade: "+idade);}
}
