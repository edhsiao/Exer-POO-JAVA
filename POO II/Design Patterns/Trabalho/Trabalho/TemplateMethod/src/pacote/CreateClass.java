package pacote;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CreateClass {
	
	String nome_classe;
	
	public int lerComando(String comando){
		StringTokenizer tokens = new StringTokenizer(comando," ");
		while(tokens.hasMoreTokens()){
			nome_classe = tokens.nextToken().toString();
			return 1;
			}
		return 0;
		}
	
	public void criarArquivo(String nome_classe,String msg) throws IOException{
		FileWriter fw = new FileWriter("src/pacote/"+nome_classe+".java");
		fw.append("package pacote; \n");
		fw.append("public class "+nome_classe+" {\n");
		fw.append("public static void main(String[] args) {");
		fw.append("System.out.println(\""+msg+"\");}}");
		fw.flush();
		fw.close();
		System.exit(1);
	}
	
	public static void main(String[] args) throws IOException {
		CreateClass c = new CreateClass();
		int cont_criar=0;
		Scanner scan = new Scanner(System.in);
		System.out.println("digite o nome da classe \n");
		while(cont_criar<1){
			String criar = scan.nextLine();
			cont_criar =c.lerComando(criar);
			if(cont_criar==1){
				System.out.println("digite a mensagem a ser impressa \n");
				
			}else{
				System.out.println("Banco ainda nÃ£o criado\n");
			}
		}
		
		int cont_comando=0;
		while(cont_comando<1){
			String msg = scan.nextLine();
			c.criarArquivo(c.nome_classe,msg);
		}
	}
	/*
	 * Para se usar deve se compilar, digitar nome da classe + Enter
	 * depois digita msg + enter
	 * clica com o bot‹o direito e da um refresh no pacote, a classe criada ir‡ aparecer e pode ser compilada pelo pr—prio eclipse
	 * */

}
