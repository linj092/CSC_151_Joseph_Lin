package labs.example.mammals;

public class Dog extends Mammal{

    public void Dog(){

    }

    public void bark(){
        System.out.println("woof...woof...woof");
    }

    public void fetch(){

    }

    public void roll(){
        System.out.println("The " + this.name + " is rolling...");
        }
        
        
        public void sit() throws Exception{
        System.out.println("The " + this.name + " is sitting...");
        Thread.sleep(15000);
    
        stand();
    
        }
    
        public void jump(){
        System.out.println("The " + this.name + " is jumping...");
        }
    
        private void stand(){
        System.out.println("The " + this.name + " is standing and barking");
        }
    
        // Optional 
        public double walk(){
        //creates the public method for walk
            int South = 3;
            int East = 4;
        //creates two integars to store the values 3 and 4
    
        System.out.println("The " + this.name + " walks " + South + " miles South and " + East + " miles East.");
        //prints out the statement of how far the mammal walks using the given values
    
        double Hypotenuse = Math.sqrt((South * South) + (East * East));
        //creates a double (to store decimals) and uses the a^2 + b^2 = c^2 to find the hypotenuse using the math sqrt that is built in to vs.
        
        System.out.println("The " + this.name + " is " + Hypotenuse + " miles from the starting point");
        //states that the mammal is X from the starting point
    
        double theta = Math.toDegrees(Math.acos(East / Hypotenuse));
        //creates a double variable to contain decimals. Uses the built-in cosine function and uses the built in degrees converter to change the answer into degrees
    
        double thetaFinal = (double)Math.round(theta * 100) / 100;
        //creates the final double variable to round the theta into the nearest two decimal places. Because the math round built-in function results in an integar
        //another double is placed to convert it into decimal form. Multiply by 100 and divide by 100 for the rounding to work because by dividing by 100 the decimal
        //moves right to fit the 0s
    
        System.out.println("Theta of the longest leg is " + thetaFinal + " miles");
        //prints out the final result for theta 
            return thetaFinal;
        }
    
        





}