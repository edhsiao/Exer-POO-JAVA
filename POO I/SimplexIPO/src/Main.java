import com.ipo.simplex.Simplex;
import com.leitor.arquivo.Arquivo;
import com.leitor.arquivo.Leitor;

/**
 * Trabalho de IPO: Simplex
 * 
 * Edward Hsiao, 63563
 * Daniel Gracia, 61546
 * Danilo Clemente, 51086
 *
 */

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Arquivo arquivo = Leitor.leitor("simplex.txt");
		Simplex simplex = new Simplex();
		System.out.println(simplex.doSimplex(arquivo, 100) ? "Bem-sucedido!" : "Mal-sucedido");
		System.out.println("Varíaveis: " );
		for(int i : simplex.base) System.out.print(i + 1 + " ");
		System.out.println();
		for(double d : simplex.sol_basica) System.out.print(d + " ");
	}

}
