package exer1;

import java.util.Scanner;

public class Teste {

	private static Scanner sc;

	public static void main(String[] args) {
		int op;
		Manipular manipulador;
		sc = new Scanner(System.in);

		do {
			System.out.println("Digite uma opção:");
			System.out
					.println("0 - Sair\n1 - Maiuscula\n2 - Minuscula\n3 - Duplicar\n4 - Inverter");
			op = sc.nextInt();
			switch (op) {
			case 1:
				manipulador = new Maiusculo();
				System.out.println("Transformando em maiúsculo");
				manipulador.manipula_palavra();
				break;

			case 2:
				manipulador = new Minusculo();
				System.out.println("Transformando em minúsculo");
				manipulador.manipula_palavra();
				break;

			case 3:
				manipulador = new Duplica();
				System.out.println("Duplicando Palavra");
				manipulador.manipula_palavra();
				break;

			case 4:
				manipulador = new Inverte();
				System.out.println("Invertendo palavra");
				manipulador.manipula_palavra();
				break;

			case 0:
				System.out.println("FIM!");
				System.exit(0);
				break;

			default:
				System.out.println("Entre com um numero valido!! ");
				break;
			}
		} while (op != 0);
	}
}
