package frc.robot.devices;

import com.revrobotics.CANEncoder;

public class CANSparkMaxEncoder extends Encoder{
    private CANEncoder encoder;

    public CANSparkMaxEncoder(CANEncoder encoder){
        this.encoder = encoder;
    }


    @Override
    public double getPos() {
        return encoder.getPosition();
    }

    @Override
    public double getVel() {
        return encoder.getVelocity();
    }

    @Override
    public void setInverted(boolean inverted) {
        encoder.setInverted(inverted);
    }

    @Override
    public boolean getInverted() {
        return encoder.getInverted();
    }

    @Override
    public void reset() {
        encoder.setPosition(0);
        
    }
    
}
