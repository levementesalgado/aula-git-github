package calculos;

public class Calculando implements Calculos {
	public double somar(double a, double b) {
		return a + b;
	}

	public double sub(double a, double b) {
		return a - b;
	}

	public double mult(double a, double b) {
		return a * b;
	}

	public int div(int a, int b) {
		if (b == 0) {
			System.out.println("Erro: divisão por zero");
			return 0;
		}
		return a / b;
	}

	public int exp(int base, int expoente) {
		int resultado = 1;
		int i;

		for (i = 0; i < expoente; i++) {
			resultado = resultado * base;
		}

		return resultado;
	}
}
