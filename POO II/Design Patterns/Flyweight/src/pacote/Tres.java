package pacote;

public class Tres {
	public String returnTres(Object obj){
		if(obj instanceof Tres)
			return "3";
		else
			return "0";
		}
}
