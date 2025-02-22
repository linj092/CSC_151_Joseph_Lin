package labs.example.physics;

public class Main {
    public static void main(String[] args) {
        Physics physics = new Physics();
        physics.setDistance(5);
        physics.setVelocity(6.5);
        physics.setMomentum(3);
        physics.setForce(7);
        physics.setWork(5);
        physics.setKineticEnergy(3);
        physics.setPotentialEnergy(7);
        physics.setTime(20);
        physics.setMass(15);
        physics.setAcceleration(3);
        physics.setDisplacement(2);
        physics.setHeight(8);
        
        physics.getTimeFromSunToEarthInHours();
        double velocitys = physics.getLightSpeedInMPH();
        double times = physics.getTimeFromSunToEarthInHours();
        double distance = physics.getDistance(velocitys, times);
        physics.getVelocity();
        physics.getMomentum();
        physics.getForce();
        physics.getWork();
        physics.getKineticEnergy();
        physics.getPotentialEnergy();

        double thetaFinal = physics.walk(3, 4);
        if (thetaFinal <= 37 && thetaFinal >= 36.87){
            physics.logValidAngleInfo();
        }
        else {
            physics.logInvalidAngleInfo();
        }
        if (distance != 92947266.72){
            physics.logEarthToSunInvalidDistance();
        }
        }
    }   

