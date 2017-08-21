package pacote;

import java.util.Scanner;

public class Dados implements Estatisticas {

	@Override
	public String espaco(String texto, String resp) {
		// TODO Auto-generated method stub
		int count=0;
		if(texto.equalsIgnoreCase(""))
		return "";
		else{
		for(int i=0;i<texto.length();i++){
			char e = texto.charAt(i);
			if(e==' '){
				count++;
			}
		}
		resp = "espaços = "+Integer.toString(count)+"\n";
		return letraa(texto, resp) ;
		}
	}

	@Override
	public String letraa(String texto, String resp) {
		int count=0;
		// TODO Auto-generated method stub
		if(texto.equalsIgnoreCase(""))
		return "";
		else{
			for(int i=0;i<texto.length();i++){
				char e = texto.charAt(i);
				if(e=='a'){
					count++;
				}
			}
			resp =resp + "letra a = "+Integer.toString(count)+"\n";
			return pontos(texto, resp) ;
			}
	}

	@Override
	public String pontos(String texto, String resp) {
		// TODO Auto-generated method stub
		int count=0;
		// TODO Auto-generated method stub
		if(texto.equalsIgnoreCase(""))
		return "";
		else{
			for(int i=0;i<texto.length();i++){
				char e = texto.charAt(i);
				if(e=='.'){
					count++;
				}
			}
			resp = resp + "pontos = "+Integer.toString(count)+"\n";
			return resp ;
			}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String texto="";
		String resp="";
		texto = scan.nextLine();
		Dados d = new Dados();
		System.out.println(d.espaco(texto, resp));
	}
	

}
