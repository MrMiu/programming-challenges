package frc.robot.devices;

public abstract class Encoder {

    public Encoder(){
    }

    public abstract double getPos();

    public abstract double getVel();

    public abstract void setInverted(boolean inverted);

    public abstract boolean getInverted();

    public abstract void reset();
    
}
