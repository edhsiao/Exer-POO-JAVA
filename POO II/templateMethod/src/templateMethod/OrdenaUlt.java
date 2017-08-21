package templateMethod;

import java.util.Arrays;
import java.util.Comparator;

public class OrdenaUlt implements Comparator<String> {

	public int compare(String nome1, String nome2) {

		char ult1 = nome1.charAt(nome1.length() - 1);
		char ult2 = nome2.charAt(nome2.length() - 1);

		if (ult1 == ult2)
			return 0;
		else if (ult1 > ult2)
			return 1;
		else if (ult1 <= ult2)
			return -1;
		return 0;
	}

	public static void main(String[] args) {

		String nomes[] = { "joao", "maria", "jose", "edu", "peri", "judas" };
		System.out.println("-Lista de nomes nao ordenados");
		for (int i = 0; i < nomes.length; i++)
			System.out.print(nomes[i] + " ");

		OrdenaUlt u = new OrdenaUlt();

		Arrays.sort(nomes, u);
		
		System.out.println("\n-Lista Ordenado: ");
		for (int i = 0; i < nomes.length; i++)
			System.out.println(nomes[i]);
	}

}
