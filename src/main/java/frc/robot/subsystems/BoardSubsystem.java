package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class BoardSubsystem implements Subsystem {
  
  CANSparkMax motor;
  DigitalInput limitSwitch;

  /** Creates a new Subsystem. */
  public BoardSubsystem() {
    this.motor;
    this.limitSwitch;
  }

  public CANSparkMax getMotor() {
    return motor;
  }

  public setMotor(double val) { 
    motor.set(val);
  }

  public DigitalInput getLimitSwitch() {
    return limitSwitch;
  }

  public boolean getSwitchValue() {
    return limitSwitch.getValue();
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
