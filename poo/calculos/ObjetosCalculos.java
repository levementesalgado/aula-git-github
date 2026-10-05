package calculos;

public class ObjetosCalculos {
	public static void main (String[] args) {
		Calculos conta = new Calculando();

		System.out.println("----- OBJETO 1 -----");
		System.out.println("somar: " + conta.somar(10, 4));
		System.out.println("sub: " + conta.sub(10, 4));
		System.out.println("mult: " + conta.mult(10, 4));
		System.out.println("div: " + conta.div(10, 4));
		System.out.println("exp: " + conta.exp(2, 8));
	}
}
