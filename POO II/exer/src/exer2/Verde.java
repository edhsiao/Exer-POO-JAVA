package exer2;

public class Verde extends Tick {
	Verde(Semaforo sinal) {
		super(sinal);
	}

	public void tick() {
		setState(new Amarelo(getSinal()));
	}

	public String status() {
		return "Verde";
	}
}
