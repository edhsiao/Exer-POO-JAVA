package util;

import java.util.StringTokenizer;

public class util3 {
	//3min
	public static String capitaliza(String s) {
		StringTokenizer st = new StringTokenizer(s);
		String novaFrase="";
		while(st.hasMoreTokens())
		{
			String tmp = st.nextToken();
			novaFrase += (tmp.substring(0,1)).toUpperCase() + tmp.substring(1,tmp.length()) + " ";
		}
		return novaFrase;
	}

	public static void main(String[] args) {
		System.out.println(capitaliza("asd asfds gingra"));
	}
}
