package exer1;

public class Inverte extends Manipular {
	public String transfString(String palavra) {
		int i, tam = palavra.length();
		StringBuilder inverso = new StringBuilder(tam);

		for (i = (tam - 1); i >= 0; i--)
			inverso.append(palavra.charAt(i));

		return inverso.toString();
	}
}
