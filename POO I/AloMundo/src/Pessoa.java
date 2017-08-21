
public class Pessoa {

	private String nome;
	double dinheiroNaCarteira;
	public void gastar(double valor) {
	dinheiroNaCarteira = dinheiroNaCarteira - valor;
	}
	public void receber(double valor) {
	dinheiroNaCarteira = dinheiroNaCarteira + valor;
	}
	
	public static void main(String[] args) {
		Pessoa p1= new Pessoa();
		
		p1.nome = "Joao";
		p1.dinheiroNaCarteira =10;
		p1.gastar(5);
		
		System.out.println(p1.dinheiroNaCarteira);
	}
	}

