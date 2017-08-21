package pacote;

public class Numero {
	Um um;
	Dois dois;
	Tres tres;
	Quatro quatro;
	Cinco cinco;
	Seis seis;
	Sete sete;
	Oito oito;
	Nove nove;
	Zero zero;
	
	public int gerarAleatorio(){
		return (int)(9* Math.random());
	}
	
	public String gerarAlgarismo(int n){
		if(n==1){
			if(um==null){
				um= new Um();
				return um.returnUm(um);
			}else
			{
				return um.returnUm(um);
			}
		}
		if(n==2){
			if(dois==null){
				dois= new Dois();
				return dois.returnDois(dois);
			}else{
				return dois.returnDois(dois);
			}
		}
		if(n==3){
			if(tres==null){
				tres= new Tres();
				return tres.returnTres(tres);
			}else{
				return tres.returnTres(tres);
			}
		}
		if(n==4){
			if(quatro==null){
				quatro= new Quatro();
				return quatro.returnQuatro(quatro);
			}else{
				return quatro.returnQuatro(quatro);
			}
		}
		if(n==5){
			if(cinco==null){
				cinco= new Cinco();
				return cinco.returnCinco(cinco);
			}else{
				return cinco.returnCinco(cinco);
			}
		}
		if(n==6){
			if(seis==null){
				seis= new Seis();
				return seis.returnSeis(seis);
			}else{
				return seis.returnSeis(seis);
			}
		}
		if(n==7){
			if(sete==null){
				sete= new Sete();
				return sete.returnSete(sete);
			}else{
				return sete.returnSete(sete);
			}
		}
		if(n==8){
			if(oito==null){
				oito= new Oito();
				return oito.returnOito(oito);
			}else{
				return oito.returnOito(oito);
			}
		}
		if(n==9){
			if(nove==null){
				nove= new Nove();
				return nove.returnNove(nove);
			}else{
				return nove.returnNove(nove);
			}
		}
		if(n==0){
			if(zero==null){
				zero= new Zero();
				return zero.returnZero(zero);
			}else{
				return zero.returnZero(zero);
			}
		}
		return "-1";
	}
	
	public static void main(String[] args) {
		int n;
		String resp="";
		Numero num = new Numero();
		int g=0;
		while(g<10){
		for(int i=0;i<10;i++){
				n=num.gerarAleatorio();
				resp = resp.concat(num.gerarAlgarismo(n));
		}
		g++;
		resp= resp+"\n";
		}
		System.out.println(resp);
	}

}
