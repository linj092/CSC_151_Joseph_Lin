package labs.example.loops;

public class WhileLoop {
    public void executeWhileLoop(){
        int number = 1;
        System.out.println("This is a While loop:");
        while (number <= 10){
            if (number == 1){
                System.out.println(number + "st iteration");
            }
            else if (number == 2){
                System.out.println(number + "nd iteration");
            }
            else if (number == 3){
                System.out.println(number + "rd iteration");
            }
            else{
            System.out.println(number + "th iteration");
            }
            number++;
        }
    }
}
