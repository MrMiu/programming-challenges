package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.devices.CANSparkMaxMotor;

public class BoardSubsystem implements Subsystem {
  
  CANSparkMaxMotor motor;
  DigitalInput limitSwitch;

  /** Creates a new Subsystem. */
  public BoardSubsystem(CANSparkMaxMotor motor, DigitalInput limitSwitch) {
    this.motor = motor;
    this.limitSwitch = limitSwitch;
  }

  public CANSparkMaxMotor getMotor() {
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
