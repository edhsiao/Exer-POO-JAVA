package pacote;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ManipularDados {
	
	HashMap<String, String> pessoa = new HashMap<String, String>();
	
	public int lerComando(String comando){
		StringTokenizer tokens = new StringTokenizer(comando," ");
		while(tokens.hasMoreTokens()){
			String atual = tokens.nextToken().toString();
			if(atual.equalsIgnoreCase("create")){
				return 1;
			}else{
				return 0;
			}
			}
		return 0;
		}
	public int lerOperacao(String comando){
		StringTokenizer token = new StringTokenizer(comando," ");
		while(token.hasMoreTokens()){
			String atual = token.nextToken().toString();
			if(atual.equalsIgnoreCase("new")){
				try{
				System.out.println("ok");
				///chama inserir
				String tokenId = token.nextToken().toString();
				String tokenNome = token.nextToken().toString();
				return(inserir(tokenId, tokenNome));
				}catch(Exception e){
					return 1;
				}
			}else if(atual.equalsIgnoreCase("all")){
				///chama listar
				try{
					System.out.println(pessoa);
					return 0;
				}catch(Exception e){
					e.printStackTrace();
					return 1;
				}
			}else if(atual.equalsIgnoreCase("delete")){
				//chama excluir
				pessoa.remove(token.nextToken());
			}else if(atual.equalsIgnoreCase("get")){
				//chama especifico
				try{
					System.out.println(pessoa.get(token.nextToken().toString()));
					return 0;
				}catch(Exception e){
					e.printStackTrace();
					return 1;
				}
			}else if(atual.equalsIgnoreCase("stop")){
				System.exit(1);
			}
		}
		return 0;
	}
	
	public int inserir(String id,String valor){
		System.out.println(id+" "+valor);
		try{
			pessoa.put(id, valor);
			return 0;
		}catch(Exception e){
			e.printStackTrace();
			return 1;
		}
	}
	
	public static void main(String[] args) throws IOException {
		ManipularDados m = new ManipularDados();
		int cont_criar=0;
		Scanner scan = new Scanner(System.in);
		while(cont_criar<1){
			String criar = scan.nextLine();
			cont_criar =m.lerComando(criar);
			if(cont_criar==1){
				System.out.println("Banco criado \n");
				
			}else{
				System.out.println("Banco ainda nÃ£o criado\n");
			}
		}
		int cont_comando=0;
		while(cont_comando<1){
			String comando =scan.nextLine();
			cont_comando =m.lerOperacao(comando);
		}
		System.exit(1);
	}
	/*instru›es de como usar
	 * deve se compilar, e ao digitar qualquer coisa nada acontece
	 * se digitar create espao e um nome
	 * o banco Ž criado ent‹o Ž permitido executar os comandos
	 * devendo ser no seguinte padr‹o: new id valor
	 * all
	 * get id
	 * delete id
	*/
}
