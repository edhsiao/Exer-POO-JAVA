package strategy;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DiadaSemana {

	public int getDayOfWeek() {
		GregorianCalendar calendar = new GregorianCalendar();
		int dia = calendar.get(Calendar.DAY_OF_WEEK);
		return dia;
	}

	public void MensagemDoDia(int dia_semana) {
		if (dia_semana == 1)
			System.out.println("Amanhã é segunda ... x(");
		else if (dia_semana == 2)
			System.out.println("Hoje é segunda... =(");
		else if (dia_semana == 3)
			System.out.println("Hoje é terça =l");
		else if (dia_semana == 4)
			System.out.println("Hoje é quarta =|");
		else if (dia_semana == 5)
			System.out.println("Hoje é quinta =)");
		else if (dia_semana == 6)
			System.out.println("Hoje é sexta! =]");
		else if (dia_semana == 7)
			System.out.println("Hoje é sábado! =D");
	}

	public static void main(String[] args) {
		DiadaSemana d = new DiadaSemana();
		int dia = d.getDayOfWeek();
		d.MensagemDoDia(dia);
	}
}

// 18.2 Qual a diferença entre Strategy e State?
// A diferença básica é que com o padrão Strategy, o cliente decide qual estratégia
// usar ,já no padrão State, o objeto modifica seu 
// comportamento baseado na mudança do seu estado interno.