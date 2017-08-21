import java.util.Collection;

public class Main {
	public static void imprimirRecursivo(Componente c) {
		Collection<Componente> filhos = c.getSubComponentes();
		if (filhos != null)
			for (Componente f : filhos)
				imprimirRecursivo(f);

		c.imprimir();
	}

	public static void main(String[] args) {
		Tabela tabela = new Tabela();

		Linha linha = new Linha();
		linha.adicionar(new Celula("RA"));
		linha.adicionar(new Celula("Nome"));
		linha.adicionar(new Celula("Sobrenome"));
		linha.adicionar(new Celula("Curso"));
		tabela.adicionar(linha);

		linha = new Linha();
		linha.adicionar(new Celula("63563"));
		linha.adicionar(new Celula("Edward"));
		linha.adicionar(new Celula("Hsiao"));
		linha.adicionar(new Celula("BCC"));
		tabela.adicionar(linha);

		linha = new Linha();
		linha.adicionar(new Celula("56001"));
		linha.adicionar(new Celula("Jose"));
		linha.adicionar(new Celula("Louro"));
		linha.adicionar(new Celula("BMC"));
		tabela.adicionar(linha);

		linha = new Linha();
		linha.adicionar(new Celula("45673"));
		linha.adicionar(new Celula("Maria"));
		linha.adicionar(new Celula("Josefina"));
		linha.adicionar(new Celula("BCT"));
		tabela.adicionar(linha);

		imprimirRecursivo(tabela);
	}
}
