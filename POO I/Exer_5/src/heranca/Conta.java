package heranca;

public class Conta {
	private double saldo;
	private int numero;

	public Conta(int a) {
		saldo = 100.0;
		numero = a;
	}

	public void debita(double quantia) {
		if (quantia > 0)
			saldo += quantia;
		else
			System.err.println("Conta.deposita(...): "
					+ "não se pode depositar uma quantia negativa.");
	}

	public void credita(double quantia) {
		if (quantia > 0)
			saldo -= quantia;
		else
			System.err.println("Conta.saca(...): "
					+ "não se pode sacar uma quantia negativa.");
	}

	public double getSaldo() {
		return saldo;
	}

	public double getNumero() {
		return numero;
	}

	public void imprime() {
		System.out.println("Conta " + numero + ": " + "saldo = " + saldo);
	}

	public void setSaldo(double s) {
		this.saldo = s;
	}
}