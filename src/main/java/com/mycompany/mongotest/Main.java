
package com.mycompany.mongotest;

import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import java.util.Iterator;
import org.bson.Document;

public class Main {
   
    public static void main(String args[]){
        MongoClient mongo= new MongoClient("localhost",27017);
        MongoDatabase database= mongo.getDatabase("test");
        MongoCollection<Document> collection = database.getCollection("tutorial");
         Document document= new Document("title","mongodb").append("nombre", "sergio");
         collection.insertOne(document);
         FindIterable<Document> iterDoc = collection.find(); 
         Iterator it = iterDoc.iterator(); 
             while (it.hasNext()) {  
               System.out.println(it.next());  
       
             }
    }
}
