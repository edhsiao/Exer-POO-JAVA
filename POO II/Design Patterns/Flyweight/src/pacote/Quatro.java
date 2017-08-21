package pacote;

public class Quatro {
	public String returnQuatro(Object obj){
		if(obj instanceof Quatro)
			return "4";
		else
			return "0";
		}
}
