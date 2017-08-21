package exer2;

public class Panic extends Semaforo.State {
	Panic(Semaforo sinal) {
		sinal.super();
	}

	public void on() {
		setState(new Vermelho(getSinal()));
	}

	public void off() {
	}

	public void panic() {
	}

	public void tick() {
	}

	public String status() {
		return "Panic";
	}
}
