import java.util.Collection;

public class Celula implements Componente {

	private String conteudo;

	public Celula(String conteudo) {
		this.conteudo = conteudo;
	}

	public void imprimir() {
		conteudo = conteudo + "               ";
		conteudo = conteudo.substring(0, 15);

		System.out.print(" | " + conteudo);
	}

	public Collection<Componente> getSubComponentes() {
		return null;
	}
}
