package pacote;

import java.util.ArrayList;

public class Carrinho {
	
	ArrayList<Produto> compra= new ArrayList<Produto>();
	
	public ArrayList<Produto> comprar(Produto p){
		compra.add(p);
		//System.out.println("Cadastrado com sucesso "+"\n"+p.getNome()+"\n"+p.getId()+"\n"+p.getPreco());
		return compra;
	}
	
	public ArrayList<Produto> remover(ArrayList<Produto> compra,int id){
		for(int i=0;i<compra.size();i++)
		{
			if(id==compra.get(i).getId())
			{
				System.out.println("Removendo o produto: " + compra.get(i).getNome());
				compra.remove(i);
			}else
			{
				System.out.println("Produto não encontrado");
				return compra;
			}
		}
		return compra;
	}
	
	public  ArrayList<Produto> alterar(ArrayList<Produto> compra,int id,String nome,double preco)
	{
		for(int i=0;i<compra.size();i++)
		{
			if(compra.get(i).getId()==id)
			{
				System.out.println("Alterando produto: " + compra.get(i).getNome() +"para: " +nome);
				System.out.println("Alterando produto: " + compra.get(i).getPreco() +"para: " +preco);
				compra.get(i).setNome(nome);
				compra.get(i).setPreco(preco);
			}else
			{
				System.out.println("Produto não encontrado");
				return compra;
			}
		}
		return compra;
	}
	
	public void gerarRelatorio(ArrayList<Produto> compra)
	{
		for(int i=0;i<compra.size();i++)
		{
			System.out.println("Produto: "+compra.get(i).getNome()+"\n Preço: " + compra.get(i).getPreco());
		}
	}

}
