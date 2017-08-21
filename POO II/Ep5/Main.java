public class Main {

	public static void main(String[] args) {
		InfoClima infoClima = new InfoClima();

		CondicaoAtual condicaoAtual = new CondicaoAtual(infoClima);

		infoClima.setarMedicao(32, 65, 30.4f);
		infoClima.setarMedicao(24, 70, 29.2f);
		infoClima.setarMedicao(27, 90, 29.2f);
	}
}