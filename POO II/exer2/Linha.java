import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Linha implements Componente {

	private List<Componente> celulas = new ArrayList<Componente>();

	public Linha() {
	}

	public void imprimir() {

		System.out.println(" |");

		int tamanho = (celulas.size() * 17) + 5;
		char[] linha = new char[tamanho];
		for (int i = 0; i < tamanho; i++)
			linha[i] = '-';
		System.out.println(" " + new String(linha));
	}

	public Collection<Componente> getSubComponentes() {
		return celulas;
	}

	public void adicionar(Celula c) {
		celulas.add(c);
	}
}
