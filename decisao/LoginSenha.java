import java.util.Scanner;

public class LoginSenha {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		String login;
		String senha;

		System.out.print("Informe o login: ");
		login = ler.nextLine();
		System.out.print("Informe a senha: ");
		senha = ler.nextLine();

		if (login.equals("admin") && senha.equals("1234")) {
			System.out.println("Bem-vindo ao Sistema Senai");
		} else {
			System.out.println("Dados Incorretos, informe os dados novamente");
		}

		ler.close();
	}
}
