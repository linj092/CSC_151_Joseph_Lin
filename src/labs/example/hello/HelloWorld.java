 /*
 @author: Joseph Lin
 @date: 1/27/2025
 @purpose: My first java program

 Note:...

 */
package labs.example.hello;

import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("Request: ");
        Scanner input = new Scanner(System.in);
        String request = input.nextLine();
        System.out.println("This is: " + request);
        }
    }
