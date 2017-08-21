import java.net.UnknownHostException;
import com.mongodb.*;

public class Conexao {
    
    private static final String base = "mydb";
    private static final String a = "mongodb://172.20.22.84:27017,172.20.22.85:27017,172.20.22.87:27017/?replicaSet=\"rs0\"";
    
    public static DB getConnection (){
		
        DB db = null;

        try {
                MongoClient mongoClient = new MongoClient(new MongoClientURI(a));
                db = mongoClient.getDB(base);
        } catch (UnknownHostException e) {
                System.out.println (e);
        }

        return db;
    }
    
    public static DBCollection conectar (String tabela) {
        
        DBCollection coll = null;
        
        try {            
            coll = getConnection().getCollection(tabela);            
        } catch (Exception e) {            
            System.out.println(e);
        }
        
        return coll;
    }
    
}

