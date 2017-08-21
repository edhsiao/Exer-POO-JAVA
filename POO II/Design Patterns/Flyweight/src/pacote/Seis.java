package pacote;

public class Seis {
	public String returnSeis(Object obj){
		if(obj instanceof Seis)
			return "6";
		else
			return "0";
		}
}
