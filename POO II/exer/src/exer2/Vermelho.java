package exer2;

public class Vermelho extends Tick {
	Vermelho(Semaforo sinal) {
		super(sinal);
	}

	public void tick() {
		setState(new Verde(getSinal()));
	}

	public String status() {
		return "Vermelho";
	}
}
