package exer2;

public class Main {
	public static void main(String[] args) {
		Semaforo sinal = new Semaforo();
		System.out.println("Sinal status: " + sinal.status());
		sinal.off();
		sinal.panic();
		sinal.on();
		sinal.tick();
		sinal.tick();
		sinal.tick();
		sinal.tick();
		sinal.panic();
		sinal.off();
		sinal.on();
		sinal.off();
	}
}
