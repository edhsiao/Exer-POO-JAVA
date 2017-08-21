package heranca;

public class ContaCorrente extends Conta {

	private double limite;

	public ContaCorrente(int a, double limite) {
		super(a);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	/*
	 * public void setSaldoContaCorrente() { setSaldo(1); }
	 */

	public void credita(double quantia) {
		if (quantia > 0 && quantia <= limite) {
			setSaldo(getSaldo() - quantia);
			System.out.println("Saldo: " + getSaldo());
		}
		// saldo -= quantia;
		else
			System.err
					.println("Nao se pode tirar uma quantia negativa ou igual a zero ou tirar uma quantia maior que o limite1\n");
	}

	public void debita(double quantia) {
		if (quantia > 0) {
			setSaldo(getSaldo() + quantia);
			System.out.println("Debitando: " + quantia + " em conta corrente!");
			System.out.println("Saldo: " + getSaldo() + "\n");
		} else
			System.err.println("Conta.deposita(...): "
					+ "nao se pode depositar uma quantia negativa.");
	}

}
