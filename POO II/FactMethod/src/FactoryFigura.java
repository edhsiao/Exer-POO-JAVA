public class FactoryFigura {
	public Figura getFigura(int TipoFigura) {

		if (TipoFigura == 1) {
			return new Circulo();

		} else if (TipoFigura == 2) {
			return new Quadrado();

		} else if (TipoFigura == 3) {
			return new TrianguloEquilatero();
		}
		return null;
	}
}
