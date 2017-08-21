package pacote;

import java.util.Arrays;
import java.util.Comparator;

public class Comparador implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		char c1 = (char) o1.charAt(o1.length()-1);
		char c2 =(char) o2.charAt(o2.length()-1);
		if(c1==c2){
		return 0;
		}else if(c1>c2){
			return 1;
		}else if(c1<=c2){
			return -1;
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Comparador c = new Comparador();
		
		String vet[] = new String[3];
		vet[0]="abacate";
		vet[1]="mam‹o";
		vet[2]="laranja";
		Arrays.sort(vet,c);
		for(int i=0;i<vet.length;i++){
			System.out.println(vet[i]+"\n");
		}
	}

}
