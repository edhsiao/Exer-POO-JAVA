package exer2;

public class Piscar extends Semaforo.State {
	Piscar(Semaforo sinal) {
		sinal.super();
	}

	public void on() {
		setState(new Vermelho(getSinal()));
	}

	public void off() {
	}

	public void panic() {
		setState(new Panic(getSinal()));
	}

	public void tick() {
	}

	public String status() {
		return "Piscando";
	}
}
