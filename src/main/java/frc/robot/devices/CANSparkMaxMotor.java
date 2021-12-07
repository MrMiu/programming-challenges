package frc.robot.devices;

import com.revrobotics.CANSparkMax;

public class CANSparkMaxMotor extends Motor {
    private CANSparkMax motor;
    private CANSparkMaxEncoder encoder;

    public CANSparkMaxMotor(CANSparkMax motor){
        this.motor = motor;
        encoder = new CANSparkMaxEncoder(motor.getEncoder());
    }

    @Override
    public void set(double speed) {
        motor.set(speed);
        
    }

    @Override
    public void follow(Motor leader, boolean inverted) {
        if (leader instanceof CANSparkMaxMotor) {
            CANSparkMaxMotor leader2 = (CANSparkMaxMotor) leader;
            motor.follow(leader2.getCANSparkMax(), inverted);
        } else {
            System.out.println("Not a CANSparkMax");
        }        
    }  

    @Override
    public void setInverted(boolean inverted) {
        motor.setInverted(inverted);
    }

    @Override
    public boolean getInverted() {
        return motor.getInverted();
    }

    @Override
    public CANSparkMaxEncoder getEncoder() {
        return encoder;
    }

    public CANSparkMax getCANSparkMax(){
        return motor;
    }
    
}
