package pacote;

import java.util.ArrayList;

public class Fachada {

	ArrayList<Produto> compra = new ArrayList<Produto>();
	Produto p;
	Carrinho c;
	
	public static void main(String[] args) {
		Fachada f= new Fachada();
		f.p = new Produto("lápis", 1, 2.5);
		f.c = new Carrinho();
		f.compra =f.c.comprar(f.p);
		f.p = new Produto("Caneta", 2, 3.5);
		f.compra=f.c.comprar(f.p);
		f.p = new Produto("Borracha", 3, 1.7);
		f.compra = f.c.comprar(f.p);
		f.c.gerarRelatorio(f.compra);
		f.compra = f.c.remover(f.compra, 1);
		f.c.gerarRelatorio(f.compra);
		f.compra=f.c.alterar(f.compra, 2, "Caneta", 3.0);
		f.c.gerarRelatorio(f.compra);
	}
	
}
