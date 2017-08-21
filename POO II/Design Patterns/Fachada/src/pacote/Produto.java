package pacote;

public class Produto {
	
	private String nome;
	private int id;
	private double preco;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto(String nome,int id,double preco)
	{
		setNome(nome);
		setId(id);
		setPreco(preco);
	}
	

}
