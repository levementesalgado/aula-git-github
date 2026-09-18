public class ObjetosAula16 {
	public static void main (String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();

		pessoa1.setNome("Tom Cruise");
		pessoa1.setIdade(60);
		pessoa1.setEndereco("Califórnia, USA");
		pessoa1.setProficao("Ator");
		pessoa1.setCpf("111.222.333-44");
		pessoa1.setRg("12.345.678-9");

		pessoa2.setNome("Messi");
		pessoa2.setIdade(35);
		pessoa2.setEndereco("Miami, USA");
		pessoa2.setProficao("Jogador de Futebol");
		pessoa2.setCpf("999.888.777-66");
		pessoa2.setRg("98.765.432-1");

		System.out.println("----- PESSOA 1 -----");
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getEndereco());
		System.out.println(pessoa1.getProficao());
		System.out.println(pessoa1.getCpf());
		System.out.println(pessoa1.getRg());

		System.out.println("----- PESSOA 2 -----");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getIdade());
		System.out.println(pessoa2.getEndereco());
		System.out.println(pessoa2.getProficao());
		System.out.println(pessoa2.getCpf());
		System.out.println(pessoa2.getRg());

		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();

		cliente1.setId(1);
		cliente1.setNome("Ana Souza");
		cliente1.setTelefone("(11) 99999-1111");
		cliente1.setCpf("123.456.789-00");
		cliente1.setRg("11.222.333-4");

		cliente2.setId(2);
		cliente2.setNome("Carlos Lima");
		cliente2.setTelefone("(11) 98888-2222");
		cliente2.setCpf("987.654.321-00");
		cliente2.setRg("44.555.666-7");

		System.out.println("----- CLIENTE 1 -----");
		System.out.println(cliente1.getId());
		System.out.println(cliente1.getNome());
		System.out.println(cliente1.getTelefone());
		System.out.println(cliente1.getCpf());
		System.out.println(cliente1.getRg());

		System.out.println("----- CLIENTE 2 -----");
		System.out.println(cliente2.getId());
		System.out.println(cliente2.getNome());
		System.out.println(cliente2.getTelefone());
		System.out.println(cliente2.getCpf());
		System.out.println(cliente2.getRg());

		Animal vaca = new Animal();
		Animal cachorro = new Animal();

		vaca.setNome("Mimosa");
		vaca.setEspecie("Vaca");
		vaca.setIdade(5);
		vaca.setPeso(450.0);

		cachorro.setNome("Rex");
		cachorro.setEspecie("Cachorro");
		cachorro.setIdade(3);
		cachorro.setPeso(25.5);

		System.out.println("----- ANIMAL 1 -----");
		System.out.println(vaca.getNome());
		System.out.println(vaca.getEspecie());
		System.out.println(vaca.getIdade());
		System.out.println(vaca.getPeso());
		vaca.comer();
		vaca.dormir();

		System.out.println("----- ANIMAL 2 -----");
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getEspecie());
		System.out.println(cachorro.getIdade());
		System.out.println(cachorro.getPeso());
		cachorro.andar();
		cachorro.emitirSom();

		Carro carro = new Carro();
		carro.setMarca("Fiat");
		carro.setModelo("Mobi");
		carro.setCor("Amarelo");
		carro.setAno(2024);
		carro.ligar();
		carro.acelerar();
		carro.frear();
		carro.parar();

		Aviao aviao = new Aviao();
		aviao.setMarca("Embraer");
		aviao.setModelo("E195");
		aviao.setAssentos(120);
		aviao.setAno(2020);
		aviao.ligar();
		aviao.decolar();
		aviao.acelerar();
		aviao.pousar();
	}
}
