package labs.example.postman;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;



public class postman {
    static final String urlForGemini = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.0-flash:generateContent?key=AIzaSyBmYHcmZQYtdkMTzqRLAW47NGKMMooKZF0";
    public static void main(String[] args) {
        postman postman1 = new postman();
        postman1.postmanI();
    }
    public void postmanI(){
        HttpClient client = HttpClient.newHttpClient();
        Scanner insertinginput = new Scanner(System.in);
        System.out.println("Type quit to end the conversation.");
        System.out.println("Please wait 5 seconds for the client to connect.");
        boolean freedomvalue = true;
        try{
        while(freedomvalue = true){
            System.out.print("Me: ");
            String requesting = insertinginput.nextLine();
            if (requesting.equalsIgnoreCase("quit")){
                freedomvalue = false;
                break;
        //Scanner that allows for inputs from console
            };
        //creates a client for the connection
        String requestingBody = postForGemini(requesting);
            HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(urlForGemini))
                .header ("Content-Type", "application/json")
                .POST(HttpRequest.BodyPublishers.ofString(requestingBody))
                .build();
        //creates the request and connection body

        HttpResponse<String> geminiPayloadRequest = client.send(request, HttpResponse.BodyHandlers.ofString());
        //grabs gemini's response from client that sends a request using user input
        String responseGemini = geminiResponseText(geminiPayloadRequest.body());
        System.out.println("Gemini: " + responseGemini);
        if (geminiPayloadRequest.statusCode() == 503){
            System.out.println("Gemini is currently overloaded, please try again later.");
        }
        //System.out.println("Response code: " + geminiPayloadRequest.statusCode());
        //System.out.println("Raw response: " + geminiPayloadRequest);
        //System.out.println("Response: " + geminiPayloadRequest.body());
        }
        } catch (IOException | InterruptedException a){
            System.err.println("URL Error: " + a.getMessage());
        }
    }
    public String postForGemini(String requesting){ 
        return "{\"contents\": [{\"parts\": [{\"text\": \"" + requesting +"\"}]}]}";
    //requestbody following gemini's documentations
    }
    public String geminiResponseText(String response){
        String responseReturn = "No response";
        String starter = "\"text\": \"";
        int indexBegin = response.indexOf(starter);
        if (indexBegin == -1) {return "No response";}
        indexBegin += starter.length();
        int ending = response.indexOf("\\n", indexBegin);
        if (ending == -1) {return "No response";}
        responseReturn = response.substring(indexBegin, ending).replace("\\n", "\n");
        return responseReturn;
    }
//grabs the response removing the text and \n
    public String textReplace(String text){
        return text.replace("\\", "\\\\").replace("\"", "\\\"");
    }
}
//javac -d bin src/labs/example/postman/*.java
//java -cp bin labs/example/postman/postman