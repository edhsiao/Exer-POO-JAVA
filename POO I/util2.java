package util;

public class util2 {
	//30seg
	public static boolean iguais(int[] v1, int[] v2) {
		for(int i=0; i < v1.length; i++)
			if(v1[i] != v2[i])
				return false;
		return true;
	}

}
