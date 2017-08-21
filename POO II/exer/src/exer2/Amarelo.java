package exer2;

public class Amarelo extends Tick {
	Amarelo(Semaforo sinal) {
		super(sinal);
	}

	public void tick() {
		setState(new Vermelho(getSinal()));
	}

	public String status() {
		return "Amarelo";
	}
}
