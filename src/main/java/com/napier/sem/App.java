package com.napier.sem;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

public class App
{
    public static void main(String[] args)
    {
        //connect to mongoDB on local system, we're using port 27000
        MongoClient mongoClient = new MongoClient("mongo-dbserver");
        //get a database, will create when we use it
        MongoDatabase database = mongoClient.getDatabase("mydb");
        //get a collection from the database
        MongoCollection<Document> colleciton = database.getCollection("test");
        //create a document to store
        Document doc = new Document("Name", "Kevin Chalmers")
                       .append("class", "Software Engineering Methods")
                       .append("year", "2018/19")
                       .append("result", new Document("CW", 95).append("EX", 85));
        //add document to collection
        colleciton.insertOne(doc);

        //check document in collection
        Document myDoc = colleciton.find().first();
        System.out.println(myDoc.toJson());
    }
}
