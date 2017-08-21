package heranca;

public class ContaPoupanca extends Conta {

	private double juros;

	public ContaPoupanca(int a, double juros) {
		super(a);
		this.juros = juros;
	}

	public void addJuros() {
		setSaldo(getSaldo() * juros);
	}

	public void credita(double quantia) {
		if (quantia > 0 && quantia <= getSaldo()) {
			// saldo -= quantia;
			setSaldo(getSaldo() - quantia);
			System.out.println("Creditando: " + quantia
					+ " na conta poupanca\n");
			System.out.println("Saldo: " + getSaldo() + "\n");

		} else
			System.err
					.println("Não se pode tirar mais que o saldo na conta poupança!");
	}

	public void debita(double quantia) {
		if (quantia > 0) {
			setSaldo(getSaldo() + quantia);
			System.out
					.println("Debitando: " + quantia + " na conta poupanca\n");
			System.out.println("Saldo: " + getSaldo() + "\n");
		} else
			System.err.println("Conta.deposita(...): "
					+ "não se pode depositar uma quantia negativa.");
	}
}
