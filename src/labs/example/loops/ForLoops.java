package labs.example.loops;

public class ForLoops {
    public void executeForLoop(){
        System.out.println("This is a For loop:");
        for (int number = 1; number <= 20; number++){
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
        }
        System.out.println("");
    }
    public int sumTwoCounter(int firstInt, int secondInt){
        System.out.println("This is the sumTwo Counter:");
        int returnValue = firstInt + secondInt;
        for (int sum = firstInt + secondInt; sum >= 1; sum--){
            System.out.println("The new number is " + sum);
        }
        System.out.println("");
        return returnValue;
    }
    public int sumLoopCounter(int firstInt){
        System.out.println("This is the Looping Counter:");
        int returnInt = 0;
        for (int tempInt = firstInt; tempInt >= 1; tempInt--){
            returnInt++;
        }
        System.out.println("The sum of the loop counter is " + returnInt);
        System.out.println("");
        return returnInt;
    }
    public void printMultiplicationTable(int firstInt){
        System.out.print("This is the Multiplication Table:");
        System.out.println("");
        for (int loopValue = 0; loopValue <= 12; loopValue++){
            int sum = firstInt * loopValue;
            System.out.println(sum + " x " + loopValue + " = " + sum);
        }
    }
}
