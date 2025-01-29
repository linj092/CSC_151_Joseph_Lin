
package labs.example.mammals;

public class Mammal{

    protected String hairColor;
    protected String eyeColor;
    protected String bodyTemp;
    protected String tailLength;
    protected String bodySize;
    protected String furLength;
    protected String name;

    public void Mammal(String name){

    }

    public void setName(String name){
        this.name = name;
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

    public void roll(){
    System.out.println("The " + this.name + " is rolling...");
    }
    
    public void cry(){
    System.out.println("The " + this.name + " is crying...");
    }
    
    public void sit(){
    System.out.println("The " + this.name + " is sitting...");
    }

    public void jump(){
    System.out.println("The " + this.name + " is jumping...");
    }
}
