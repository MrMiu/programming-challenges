package frc.robot.devices;

public abstract class Motor {
    
    public Motor() {
    }

    public abstract void set(double speed);

    public abstract void follow(Motor leader, boolean inverted);

    public abstract void setInverted(boolean inverted);

    public abstract boolean getInverted();

    public abstract Encoder getEncoder();

}
