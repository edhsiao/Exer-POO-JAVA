package absFactory;

public class Ponto implements Forma {

	@Override
	public void desenha() {
		System.out.println("Desenhando ponto\n");
		System.out.println(".");
	}
}
