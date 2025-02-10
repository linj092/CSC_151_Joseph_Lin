package labs.example.mammals;

public class Main {
    //public class named Main <- must be file name, the executeable
    public static void main(String[] args)throws Exception{
        //New public method named main, type static
        Dog mammal = new Dog();
        //creating a new Mammal using the pre-made structure from Mammal.java (yellow Mammal)
        //the value of Mammal is set for the new instance of the new variable mammal
        //It has access to all the public mammal "functions" inside Mammal.java as it copies the structure of it
        mammal.setName("Dog");
        //variable mammal's is passed the STRING value "Dog"
        //modified the name property from this.name = name inside the Mammal.java and set the string value "Dog"
        mammal.eat();
        //calls the mammal.eat method/function from the Mammal.java blueprint for eat

        mammal.sethairColor("Black");
        mammal.seteyeColor("Green");
        mammal.setbodyTemp("80 degree F");
        mammal.setbodySize("Giant");
        mammal.settailLength("2 Feet");
        mammal.setfurLength("5 inches");

        mammal.getMammalDetails();

        mammal.sit();
       // Dog dog = new Dog();

       // dog.bark();
        mammal.walk();
    }
}