
package labs.example.mammals;

public class Mammal{

    protected String hairColor;
    protected String eyeColor;
    protected String bodyTemp;
    protected String tailLength;
    protected String bodySize;
    protected String furLength;
    protected String name;
    protected String getMammalDetails;
    protected int mammalValue;
    public void Mammal(String name){

    }

    public void setName(String name){
        this.name = name;
    }
//allows the user to input a string value for name when called
    public void sethairColor(String hairColor){
        this.hairColor = hairColor;
    }
//allows the user to input a string value for hair color when called
    public void seteyeColor(String eyeColor){
        this.eyeColor = eyeColor;
    }
//allows the user to input a string value for eye color when called
    public void setbodyTemp(String bodyTemp){
        this.bodyTemp = bodyTemp;
    }
//allows the user to input a string value for body temp when called
    public void settailLength(String tailLength){
        this.tailLength = tailLength;
    }
//allows the user to input a string value for tail length when called
    public void setbodySize(String bodySize){
        this.bodySize = bodySize;
    }
//allows the user to input a string value for body size when called
    public void setfurLength(String furLength){
        this.furLength = furLength;
    }
//allows the user to input a string value for fur length when called

    public void getMammalDetails(){
    System.out.println("Hair Color:" + this.hairColor +  " | Eye Color:" + this.eyeColor + " | Body Temperature:" + this.bodyTemp + " | Tail Length:" + this.tailLength + " | Body Size:" + this.bodySize + " | Fur Length:" + this.furLength);
    }

    public void run(){
    System.out.println("The " + this.name + " is running...");
    }

    public void eat(){
    System.out.println("The " + this.name + " is eating...");
    }

    public void sleep(){
    System.out.println("The " + this.name + " is sleeping...");
    }

    public void scratch(){
    System.out.println("The " + this.name + " is scratching...");
    }

    public void bite(){
    System.out.println("The " + this.name + " is biting...");
    }

    public void cry(){
        System.out.println("The " + this.name + " is crying...");
        }

}
