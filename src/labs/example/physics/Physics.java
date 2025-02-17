package labs.example.physics;

public class Physics {
   protected double distance;
   protected double velocity;
   protected double momentum;
   protected double force;
   protected double work;
   protected double kineticEnergy;
   protected double potentialEnergy;
   protected double time; 
   protected double mass;
   protected double acceleration;
   protected double displacement;
   final static double gravity = (9.81);
   protected double height;
   double thetaFinal;
   double lightSpeedInMPH;
   double knownDistanceToEarth;
   protected double distanceFinal;
   double TimeFromSunToEarthInHours;

public void setHeight(double height){
    this.height = height;
}
public void setDisplacement(double displacement){
    this.displacement = displacement;
}
public void setAcceleration(double acceleration){
    this.acceleration = acceleration;
}
public void setMass(double mass){
    this.mass = mass;
}
public void setTime(double time){
    this.time = time;
}
public void setDistance(double distance){
    this.distance = distance;
}
public void setVelocity(double velocity){
    this.velocity = velocity;
}
public void setMomentum(double momentum){
    this.momentum = momentum;
}
public void setForce(double force){
    this.force = force;
}
public void setWork(double work){
    this.work = work;
}
public void setKineticEnergy(double kineticEnergy){
    this.kineticEnergy = kineticEnergy;
}
public void setPotentialEnergy(double potentialEnergy){
    this.potentialEnergy = potentialEnergy;
}
public double getDistance(double velocity, double time){
    distanceFinal = (velocity * time);
    System.out.println("Distance is " + distanceFinal + " miles");
    return distanceFinal;
}
public void getVelocity(){
    double velocityFinal = (this.distance / this.time);
    System.out.println("Velocity is " + velocityFinal + " mph");
}
public void getMomentum(){
    double momentumFinal = (this.mass * this.time);
    System.out.println("Momentum is " + momentumFinal + " kg m/s");
}
public void getForce(){
    double forceFinal = (this.mass * this.acceleration);
    System.out.println("Force is " + forceFinal + " kg m/s^2");
}
public void getWork(){
    double workFinal = (this.force * this.displacement);
    System.out.println("Work is " + workFinal + " Joules");
}
public void getKineticEnergy(){
    double kineticEnergyFinal = (0.5 * this.mass * (this.velocity * this.velocity));
    System.out.println("Kinetic energy is " + kineticEnergyFinal + " Joules");
}
public void getPotentialEnergy(){
    double potentialEnergyFinal = (this.mass * gravity * this.height);
    System.out.println("Potential energy is " + potentialEnergyFinal + " Joules");
}
public double walk(int South, int East){

    double Hypotenuse = Math.sqrt((South * South) + (East * East));

    double theta = Math.toDegrees(Math.acos(East / Hypotenuse));
    //creates a double variable to contain decimals. Uses the built-in cosine function and uses the built in degrees converter to change the answer into degrees

    thetaFinal = (double)Math.round(theta * 100) / 100;
    //creates the final double variable to round the theta into the nearest two decimal places. Because the math round built-in function results in an integar
    //another double is placed to convert it into decimal form. Multiply by 100 and divide by 100 for the rounding to work because by dividing by 100 the decimal
    //moves right to fit the 0s

    System.out.println("Theta of the longest leg is " + thetaFinal + " miles");
    //prints out the final result for theta 
        return thetaFinal;
    }
public void logInvalidAngleInfo(){
    System.out.println("logging the angle " + thetaFinal + " degrees. This is not the right angle");
}
public void logValidAngleInfo(){
    System.out.println("logging the angle " + thetaFinal + " degrees. This is a valid 3-4-5 triangle");
}

public double getLightSpeedInMPH(){
    lightSpeedInMPH = (186282 * 60 * 60);
    return lightSpeedInMPH;
}
public double getKnownDistanceToEarth(){
    knownDistanceToEarth = 92947266.72;
    return knownDistanceToEarth;
}
public double getTimeFromSunToEarthInHours(){
    getKnownDistanceToEarth();
    getLightSpeedInMPH();
    TimeFromSunToEarthInHours = (knownDistanceToEarth / lightSpeedInMPH);
    return TimeFromSunToEarthInHours;
}
public void logEarthToSunInvalidDistance(){
    System.out.println("logging the distance " + distanceFinal + " miles per hour. This is not the right distance of light to the Earth from the Sun of 92947266.72 miles");
}



}
