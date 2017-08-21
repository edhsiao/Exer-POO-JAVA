package exer1;

import java.util.Scanner;

public abstract class Manipular {

	private Scanner sc;

	public void manipula_palavra() {

		sc = new Scanner(System.in);
		System.out.print("Digite a palavra: ");
		String palavra = sc.nextLine();
		System.out.println("Resultado: " + transfString(palavra) + "\n");

	}

	public abstract String transfString(String palavra);
}
