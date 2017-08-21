import com.mongodb.*;
import java.util.*;

public class Banco {

    private static DBCollection usuarios = null;
    private static DBCollection posts = null;
    
    public Banco () {
        
        try {
            usuarios = Conexao.conectar("usuarios");
            posts = Conexao.conectar("posts");
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }

    public Boolean search (String usuario, String senha) {
      
        /*
        *Recebe um nome de usuário e uma senha. 
        *Retorna true se estiverem corretos, e false caso contrário ou em caso de falha.
        */
  
        try {
	    DBObject query = new BasicDBObject("usuario", usuario);
       	    DBObject dbObj = usuarios.findOne(query);

	    if (dbObj.get("senha").toString().equals(senha)) {
                return true;
	    }
			
	} catch (Exception e) {              
	    System.out.println(e);
        }
                
        return false;
    }

    public List<Map> feed_geral(int n, Date data) {

        /*
        *Retorna um número n de postagens de todas as páginas, ordenadas por data. 
        *Recebe como argumento uma data e só retorna postagens de antes daquela data.
        *Retorno é uma lista de mapas, onde cada mapa é uma postagem com seus respectivos campos.
        */

        BasicDBObject query = new BasicDBObject();
        query.append("date", new BasicDBObject("$lte",data));

        ArrayList<Map> resultados = new ArrayList<Map>();

        try {
            DBCursor cursor = posts.find(query);
            cursor.limit(n);
            BasicDBObject orderBy = new BasicDBObject();
            orderBy.append("date",1);
            cursor = cursor.sort(orderBy);
            while(cursor.hasNext()) {
                resultados.add(cursor.next().toMap());
            }
        } catch(Exception e) {
            System.out.println(e);
        }

        return resultados;
    }

    public List<Map> feed_pagina(int n, Date data, String page) {

        /*
	*Igual feed_geral, mas retorna apenas postagens da página especificada em page.
        */

        BasicDBObject query = new BasicDBObject();
        query.append("date", new BasicDBObject("$lte",data));
        query.append("page", page);

        ArrayList<Map> resultados = new ArrayList<Map>();

        try {
            DBCursor cursor = posts.find(query);
            cursor.limit(n);
            BasicDBObject orderBy = new BasicDBObject();
            orderBy.append("date",1);
            cursor = cursor.sort(orderBy);
            while(cursor.hasNext()) {
                resultados.add(cursor.next().toMap());
            }
        } catch(Exception e) {
            System.out.println(e);
        }

        return resultados;
    }

    /*
    *Métodos que devem ser implementados, por funcionalidade:
    *
    *1-Cadastro:
    *-Inserir usuário (para isso definir documento do usuário)
    *-Verificar email (ver se já existe)
    *-Recuperar usuário (retornar Map com dados dos usuários)
    *-Validar usuário (calidar o número recebido no email, o usuário entra o número e retorna true ou false)
    *
    *2-Feed: As que implementei, feed_geral e fee_pagina.
    *
    *3-Postagem
    *-Inserir postagem
    *-Deletar postagem
    *
    *4-Favoritar
    *-Favoritar (adicionar nome de página favoritada no registro do usuário)
    *-Desfavoritar
    *-Feed personalizado (igual fee_geral, mas só retorna postagens de páginas favoritadas pelo usuário)
    *
    *Obs.: Documento usado para post:
    *{
    *login:"login@unifesp.br",
    *page:"nomeDaPagina",
    *date:data (banco retorna objeto Date para o java)
    *content: "conteudoDoPost" 
    *}
    */

    public static void main(String args[]) {

        /* Teste */

        Banco base = new Banco();

        List<Map> postagens = base.feed_pagina(4,Calendar.getInstance().getTime(),"Arlindo");

	for(Map m : postagens)
            System.out.println(m);

        return ;
    }

}

