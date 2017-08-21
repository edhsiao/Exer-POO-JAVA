package pacote;

public class Cinco {
	public String returnCinco(Object obj){
		if(obj instanceof Cinco)
			return "5";
		else
			return "0";
		}
}
