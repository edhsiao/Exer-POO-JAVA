package composite;

import java.util.ArrayList;

public class Instituicao extends Participante {
	protected ArrayList<Individuo> List = new ArrayList<Individuo>();

	public int getMembros() {
		return List.size();
	}

	public void add(Individuo e) {
		List.add(e);
	}
}
