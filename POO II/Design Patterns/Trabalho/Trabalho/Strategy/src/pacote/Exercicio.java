package pacote;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercicio {
	
	public int getDayOfWeek(){
		GregorianCalendar calendar = new GregorianCalendar();
		int dia = calendar.get(Calendar.DAY_OF_WEEK);
		return dia;
	}
	
	public void fazerTarefa(int dia_semana){
		if(dia_semana==1){ System.out.println("fazer tarefa");}
		else if(dia_semana==2){System.out.println("fazer almoço");}
		else if(dia_semana==3){System.out.println("fazer janta");}
		else if(dia_semana==4){System.out.println("comer fora");}
		else if(dia_semana==5){System.out.println("dormir");}
		else if(dia_semana==6){System.out.println("ver jogo");}
		else if(dia_semana==7){System.out.println("fazer nada");}
	}
	
	public static void main(String[] args) {
		Exercicio e = new Exercicio();
		int dia = e.getDayOfWeek();
		e.fazerTarefa(dia);
	}
	

}
