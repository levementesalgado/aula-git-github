package classeabstrata;

public abstract class Animal {
	String nome;
	String sexo;
	String raca;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public void dormir() {
		System.out.println(nome + " está dormindo.");
	}

	public void caminhar() {
		System.out.println(nome + " está caminhando.");
	}

	public void correr() {
		System.out.println(nome + " está correndo.");
	}

	public abstract void emitirSom();
}
