public class CondicaoAtual implements Observador, Exibir {
	private float temp;
	private float umidade;
	private Sujeito infoClima;

	public CondicaoAtual(Sujeito InfoClima) {
		this.infoClima = InfoClima;
		InfoClima.cadastrar(this);
	}

	public void atualiza(float temp, float umidade, float pressao) {
		this.temp = temp;
		this.umidade = umidade;
		display();
	}

	public void display() {
		System.out.println("Situacao atual: " + temp + "C e " + umidade
				+ "% umidade");
	}
}
