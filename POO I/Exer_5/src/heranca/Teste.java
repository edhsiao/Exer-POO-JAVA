package heranca;

public class Teste {

	public static void main(String[] args) {

		ContaCorrente cr1 = new ContaCorrente(1, 1000);
		ContaPoupanca cp1 = new ContaPoupanca(5, 1.15);

		
		  System.out.println("Saldo: " + cr1.getSaldo() + " Numero: " +
		  cr1.getNumero() + " Limite: " + cr1.getLimite());
		 

		 cp1.addJuros();

		
		  System.out.println("\n\n Saldo: " + cp1.getSaldo() + " Numero: " +
		  cp1.getNumero());
		 

		 cr1.credita(1001);
		 cr1.credita(101);
		 cr1.credita(1);
		 cr1.debita(10000);
		 cp1.debita(10000);
	}

}
