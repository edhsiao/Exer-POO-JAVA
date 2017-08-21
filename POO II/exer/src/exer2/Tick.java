package exer2;

public abstract class Tick extends Semaforo.State {
	Tick(Semaforo sinal) {
		sinal.super();
	}

	public void off() {
		setState(new Piscar(getSinal()));
	}

	public void panic() {
		setState(new Panic(getSinal()));
	}
}
