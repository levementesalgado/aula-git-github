import java.util.Scanner;

public class BonusSalarial {
	public static void main (String[] args) {
		Scanner ler = new Scanner(System.in);
		int anosDeEmpresa;
		double salario;
		double bonusIfElse;
		double bonusSwitch;
		double bonusTernario;

		System.out.print("Informe o salário do funcionário: ");
		salario = ler.nextDouble();
		System.out.print("Informe os anos de empresa: ");
		anosDeEmpresa = ler.nextInt();

		if (anosDeEmpresa <= 3) {
			bonusIfElse = salario * 0.05;
		} else {
			bonusIfElse = salario * 0.07;
		}

		switch (anosDeEmpresa) {
			case 0:
			case 1:
			case 2:
			case 3:
				bonusSwitch = salario * 0.05;
				break;
			default:
				bonusSwitch = salario * 0.07;
		}

		bonusTernario = (anosDeEmpresa <= 3) ? salario * 0.05 : salario * 0.07;

		System.out.println("Bônus com if/else: " + bonusIfElse);
		System.out.println("Bônus com switch: " + bonusSwitch);
		System.out.println("Bônus com ternário: " + bonusTernario);

		ler.close();
	}
}
