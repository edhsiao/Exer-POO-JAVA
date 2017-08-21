package absFactory;

public class Triangulo implements Forma {

	@Override
	public void desenha() {
		System.out.println("Desenhando triangulo\n");
		System.out.println("  /\\  ");
		System.out.println(" /  \\ ");
		System.out.println("/____\\ ");
	}
}
