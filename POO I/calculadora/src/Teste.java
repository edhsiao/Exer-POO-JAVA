import java.io.ObjectInputStream.GetField;


public class Teste {
	
	private double saldo;
	private double limite;
	String noconta;
	private Cliente cliente;
	
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void saca(double quantia)
	{
		if(quantia<= this.saldo)
				saldo=saldo-quantia;
		else 
			System.out.println("ERRO");
				
	}
	
	public void deposita(double quantia){
		saldo=saldo+quantia;
	}
	public String mostrasaldo(){
		return this.saldo+"";
	}
	public static void main(String[] args) {
		
		Teste c= new Teste();
		

		Cliente cl = new Cliente();
		cl.setNome("Bill");
		cl.setEndereco("Rua a m20");
		cl.setTel("666666666");
		c.setCliente(cl);
		c.deposita(500);
		c.saca(500);
		
		System.out.println(c.mostrasaldo());
		System.out.println(c.getCliente().getNome());

	}


}
