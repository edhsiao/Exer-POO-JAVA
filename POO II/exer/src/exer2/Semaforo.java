package exer2;

public class Semaforo {

	private State _state;

	public abstract class State {

		public abstract void tick();

		public abstract void panic();

		public void on() { /* ignorado por padrao */
		}

		public abstract void off();

		public abstract String status();

		protected void setState(State newState) {
			_state = newState;
		}

		protected Semaforo getSinal() {
			return Semaforo.this;
		}
	}

	public Semaforo() {
		_state = new Piscar(this);
	}

	public void on() {
		System.out.print("[" + status() + "]");
		_state.on();
		System.out.println(" --(on)-> [" + status() + "]");
	}

	public void off() {
		System.out.print("[" + status() + "]");
		_state.off();
		System.out.println(" --(off)-> [" + status() + "]");
	}

	public void panic() {
		System.out.print("[" + status() + "] --(panic)-> ");
		_state.panic();
		System.out.println("[" + status() + "]");
	}

	public void tick() {
		System.out.print("[" + status() + "] --(tick)-> ");
		_state.tick();
		System.out.println("[" + status() + "]");
	}

	public String status() {
		return _state.status();
	}
}