package labs.example.postman;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.util.Scanner;
import javax.net.ssl.HttpsURLConnection;

public class postman {
    public static void main(String[] args) {
        postman postman1 = new postman();
        postman1.postmanI();
    }
    public void postmanI(){
        boolean freedomvalue = true;
        try{
        URL postman = new URI("https://generativelanguage.googleapis.com/").toURL();//v1beta/models/gemini-2.0-flash:generateContent?key=AIzaSyBmYHcmZQYtdkMTzqRLAW47NGKMMooKZF0");
        URI postmanURI = new URI("https://generativelanguage.googleapis.com/");
        //create a URL for the site
        HttpURLConnection connection = (HttpsURLConnection) postman.openConnection();
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Authorization", "Bearer " + "AIzaSyBmYHcmZQYtdkMTzqRLAW47NGKMMooKZF0");
        connection.setRequestProperty("Connection-Type", "application/json");
        connection.setDoOutput(true);
        connection.connect();
        //opens connection
        HttpClient client = HttpClient.newHttpClient();
        //HttpRequest request = HttpRequest.newBuilder()
        //    .uri(URI.create("https://generativelanguage.googleapis.com/"))
        //    .POST(HttpRequest.BodyPublisher.ofString(requesting))
        //    .build();
        while(freedomvalue = true){
            System.out.print("Me: ");
            Scanner insertinginput = new Scanner(System.in);
            String requesting = insertinginput.next();
            if (requesting.equalsIgnoreCase("quit")){
                freedomvalue = false;
                break;
            }};
        //JsonParser parse = new JSONParser();
        } catch (IOException | URISyntaxException a){
            System.err.println("URL Error: " + a.getMessage());
        }
    }
}
//javac -d bin src/labs/example/postman/*.java
//java -cp bin labs/example/postman/postman