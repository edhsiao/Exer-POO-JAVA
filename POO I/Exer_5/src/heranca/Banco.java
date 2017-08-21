package heranca;

public class Banco {

	public void atualiza(Conta vConta) {

	}

	public void abrirConta() {

	}

	public void fecharConta() {

	}

	public static void main(String[] args) {
		

		Conta[] vConta = new Conta[2];

		vConta[0] = new ContaCorrente(1, 1000);

		System.out.println("Criando uma Conta Corrente de numero: "
				+ vConta[0].getNumero());

		vConta[0].credita(25);
		vConta[0].debita(25);

		// ////////////////////////////////////////

		vConta[1] = new ContaPoupanca(2, 1.15);

		System.out.println("Criando uma Conta Poupanca de numero: "
				+ vConta[1].getNumero());

		vConta[1].credita(1000000);

		vConta[1].debita(100);
	}

}
