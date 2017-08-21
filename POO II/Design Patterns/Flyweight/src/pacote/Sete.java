package pacote;

public class Sete {
	public String returnSete(Object obj){
		if(obj instanceof Sete)
			return "7";
		else
			return "0";
		}
}
