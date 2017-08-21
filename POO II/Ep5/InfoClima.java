import java.util.ArrayList;

public class InfoClima implements Sujeito {

	private ArrayList observadores;
	private float temp;
	private float umidade;
	private float pressao;

	public InfoClima() {
		observadores = new ArrayList();
	}

	public void registrar(Observador o) {
		observadores.add(o);
	}

	public void remover(Observador o) {
		int i = observadores.indexOf(o);
		if (i >= 0) {
			observadores.remove(i);
		}
	}

	public void notificar() {
		for (int i = 0; i < observadores.size(); i++) {
			Observador observador = (Observador) observadores.get(i);
			observador.atualiza(temp, umidade, pressao);
		}
	}

	public void medicaoModificado() {
		notificar();
	}

	public void setarMedicao(float temp, float umidade, float pressao) {
		this.temp = temp;
		this.umidade = umidade;
		this.pressao = pressao;
		medicaoModificado();
	}

	public float getTemperature() {
		return temp;
	}

	public float getumidade() {
		return umidade;
	}

	public float getpressao() {
		return pressao;
	}

	@Override
	public void cadastrar(Observador o) {
		// TODO Auto-generated method stub

	}
}
