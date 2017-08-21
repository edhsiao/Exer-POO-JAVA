package pacote;

public class Um {

	public String returnUm(Object obj){
	if(obj instanceof Um)
		return "1";
	else
		return "0";
	}
}
