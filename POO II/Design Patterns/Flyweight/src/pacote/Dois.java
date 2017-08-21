package pacote;

public class Dois {
	public String returnDois(Object obj){
		if(obj instanceof Dois)
			return "2";
		else
			return "0";
		}
}
