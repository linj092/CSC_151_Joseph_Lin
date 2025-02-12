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
public double getDistance(){
    double distanceFinal = (this.velocity * this.time);
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
}