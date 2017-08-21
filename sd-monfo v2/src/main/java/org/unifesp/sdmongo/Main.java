package org.unifesp.sdmongo;


import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import org.bson.types.ObjectId;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

    public static MongoClient client;
    public static MongoDatabase db;

    public static Document getUser(String userLogin) {
        return db.getCollection("users").find(Filters.eq("login", userLogin)).first();
    }

    public static void addFavorite(ObjectId oid, String userLogin) {
        // 1. Seleciona a coleção de usuários
        // 2. Encontra o primeiro usuário com login igual ao fornecido e o atualiza de acordo com
        // o documento passado - o documento utiliza um operador que insere um elemento novo em um array
        // embutido no usuário, a menos que o elemento já exista
        db.getCollection("users")
                .findOneAndUpdate(Filters.eq("login", userLogin),
                        new Document("$addToSet", new Document("favorites", oid)));
    }

    public static void removeFavorite(ObjectId oid, String userLogin) {
        // 1. Seleciona a coleção de usuários
        // 2. Encontra o primeiro usuário com login igual ao fornecido e o atualiza de acordo com
        // o documento passado - o documento utiliza um operador que remove todos os elementos pré-existente
        // iguais ao fornecido em um array embutido no usuário, a menos que o elemento já tenha sido removido
        db.getCollection("users")
                .findOneAndUpdate(Filters.eq("login", userLogin),
                        new Document("$pull", new Document("favorites", oid)));
    }

    public static List<Document> allPosts(LocalDateTime dt) {
        // 1. Seleciona a coleção com os posts (getCollection)
        // 2. Força retornar todos os elementos da coleção (find vazio) se o tempo passado for nulo
        // 3. Se o tempo passado não for nulo, usar ele para selecionar todos os posrs mais novos que o tempo
        // passado, via função que cria um JSON de forma mais natural (Filters.gte)
        // 4. Ordena por timestamp, do mais novo para o mais antigo, passando um JSON com o nome do campo
        // de timestamp e um número mágico dizendo para ser em ordem decrescente (-1)
        // 5. Insere todos os elementos coletados em um ArrayList criado na hora
        if(dt == null) {
            return db.getCollection("posts").find().sort(new Document("timestamp", -1))
                    .into(new ArrayList<Document>());
        } else {
            return db.getCollection("posts").find(Filters.gte("timestamp", dt))
                    .sort(new Document("timestamp", 1)).into(new ArrayList<Document>());
        }
    }

    public static List<Document> allPosts() {
        return allPosts(null);
    }

    public static List<Document> favorites(String userLogin) {
        // 1. Seleciona a coleção com os usuários
        // 2. Retorna apenas os elementos que possuem login igual ao que foi passado
        // 3. Assumir que os usuários possuem logins únicos e que essa pesquisa retornará apenas um JSON
        // de usuário - para facilitar podemos usar first
        // 4. Selecionar campo de favoritos com o get, tentando fazer a conversão automática para uma lista
        // de ObjectIds
        List<ObjectId> postsIds = db.getCollection("users")
                .find(Filters.eq("login", userLogin))
                .first().get("favorites", List.class);

        // 1. Seleciona a coleção de postagens
        // 2. Retorna apenas os elementos que possuem id como sendo um dos ObjectIds recuperados
        // 3. Ordena o resultado pelas postagens mais recentes
        // 4. Salva todos os resultados dentro de um ArrayList
        return db.getCollection("posts").find(Filters.in("_id", postsIds)).sort(new Document("timestamp", -1))
                .into(new ArrayList<Document>());
    }




	//TESTE
    public static void main(String[] args) throws Throwable {
        client = new MongoClient();
        db = client.getDatabase("sd");

        // Instancia um gerador aleatório para testar
        Random rand = new Random();

        // Recupera todos os posts, e executa uma função anônima do Java 8 para cada elemento da lista,
        // printando a sua representação em JSON
        List<Document> allPosts = allPosts();
        allPosts.forEach(e -> System.out.println(e.toJson()));

        // Imprime o JSON do usuário que será manipulado
        System.out.println("\n" + getUser("edward@email.com"));

        // Seleciona os posts, ordena-os de forma aleatória, pula os 3 primeiros e
        // executa uma função anônima para cada um que os adiciona nos favoritos
        // do usuário de login fornecido
        List<Document> randomPosts = allPosts.stream().sorted((e1, e2) -> rand.nextInt() - rand.nextInt())
                .skip(3).collect(Collectors.toList());
        randomPosts.forEach((e) -> addFavorite(e.getObjectId("_id"), "edward@email.com"));

        // Recupera os favoritos do usuário de login fornecido e imprime na tela similar a anteriormente
        favorites("edward@email.com").forEach(e -> System.out.println(e.toJson()));

        // Imprime o JSON do usuário manipulado para verificação
        System.out.println("\n" + getUser("edward@email.com"));

        // Remove os dois primeiros posts dos favoritos do usuário anteriormente manipulado
        randomPosts.stream().skip(1).forEach(e -> removeFavorite(e.getObjectId("_id"), "edward@email.com"));

        // Recupera os favoritos do usuário de login fornecido de novo, para verificar que a deleção funcionou
        favorites("edward@email.com").forEach(e -> System.out.println(e.toJson()));

        // Imprime o JSON do usuário manipulado para verificação novamente
        System.out.println("\n" + getUser("edward@email.com"));

        // Deleta todos os favoritos do usuário para manter o banco limpo
        randomPosts.forEach(e -> removeFavorite(e.getObjectId("_id"), "edward@email.com"));

        // Imprime o JSON do usuário manipulado pela ultima vez
        System.out.println("\n" + getUser("edward@email.com"));
    }
}
