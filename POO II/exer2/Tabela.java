import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Tabela implements Componente {
	private List<Componente> linhas = new ArrayList<Componente>();

	public Tabela() {
	}

	public void imprimir() {
	}

	public Collection<Componente> getSubComponentes() {
		return linhas;
	}

	public void adicionar(Linha l) {
		linhas.add(l);
	}
}
