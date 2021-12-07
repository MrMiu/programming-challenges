package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class BoardSubsystem implements Subsystem {
  
  CANSparkMax motor;
  DigitalInput limitSwitch;

  public CANSparkMax getMotor() {
    return motor;
  }

  public void setMotor(double val) { 
    motor.set(val);
  }

  public DigitalInput getLimitSwitch() {
    return limitSwitch;
  }

  public boolean getSwitchValue() {
    return limitSwitch.get();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}
