package pacote;

public class Oito {
	public String returnOito(Object obj){
		if(obj instanceof Oito)
			return "8";
		else
			return "0";
		}
}
