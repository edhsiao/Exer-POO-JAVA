
public class Carro {
	
	String marca;
	String modelo;
	String placa;
	int aceleracao;
	

	public void acelerar (int a){
		aceleracao=a;
		System.out.println("Acelerando o carro para "+a);
	}
	public void frear (){
		System.out.println("Freando o carro");
	}
	public static void main(String[] args) {
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		c1.marca = "Ferrari";
		c1.modelo = "F50";
		c1.placa = "FER-F500";
		
		
		c2.marca = "Fiat";
		c2.modelo = "UNO";
		c2.placa = "FIA-TUNO";
		
		
		c1.acelerar(180);
		c1.frear();
		c2.acelerar(90);
		c2.frear();
	}
}
