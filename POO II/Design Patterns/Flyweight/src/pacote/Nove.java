package pacote;

public class Nove {
	public String returnNove(Object obj){
		if(obj instanceof Nove)
			return "9";
		else
			return "0";
		}
}
