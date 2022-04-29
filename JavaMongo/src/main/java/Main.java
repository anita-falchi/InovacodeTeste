import java.util.Arrays;
import java.util.Date;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

public class Main {
	
	public static void main(String[] args) {
		MongoClient cliente = new MongoClient();
		MongoDatabase bancoDeDados = cliente.getDatabase("db"); 
		MongoCollection<Document> inovacode = bancoDeDados.getCollection("inovacode");
		Document client = inovacode.find().first();
		System.out.println(client);
//		
		Document novoClient = new Document("nome", "Jacqueline")
				.append("email", "jacqueline@email.com");
		
		inovacode.insertOne(novoClient);
		
//		inovacode.updateOne(Filters.eq("nome" ,"Juliana "),
//			new Document("$set", new Document("nome", "Juliana Nogueira")));
		
//		inovacode.deleteOne(Filters.eq("nome", "Juliana Nogueira"));
		
		cliente.close();
		
	}
}




