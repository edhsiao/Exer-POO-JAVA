package composite;

import java.util.ArrayList;

public class Congresso {
	protected ArrayList<Participante> List = new ArrayList<Participante>();
	int totalDeCadeiras;
	public int totalParticipantes() {
	return List.size();
	}

	public int totalAssentos() {
		int cont = 0;
		for (int i = 0; i < List.size(); i++) {
		cont =   List.get(i).getMembros();
		}
		return cont;
	}
 public static void main(String[] args) {
	Congresso c1= new Congresso();

	System.out.println(c1.totalDeCadeiras);
}

}
