package src;

import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MongoClientURI uri = new MongoClientURI(
                "mongodb+srv://MyDB:??????????????????@cluster0.308jd.mongodb.net/vehicles?retryWrites=true&w=majority");
        MongoClient mongoClient = new MongoClient(uri);
        MongoDatabase database = mongoClient.getDatabase("vehicles");
        MongoCollection mongoCollection = database.getCollection("car");

        Document document = new Document();
        document.put("Mark","Audi");
        document.put("Model","A3");

        mongoCollection.insertOne(document);
    }
}
