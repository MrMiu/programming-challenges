package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANDigitalInput.LimitSwitch;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class BoardSubsystem implements Subsystem {
  
  CANSparkMax motor;
  DigitalInput limitSwitch;
  string Motor;

  public BoardSubsystem(CANSparkMax motor, DigitalInput limitSwitch) {
    this.motor = motor;
    this.limitSwitch = limitSwitch;
  }

  public CANSparkMax getMotor() {
    return Motor;
  }

  public void setMotor(double val) { 
    motor.set(val);
  }

  public DigitalInput getLimitSwitch() {
    return limitSwitch;
  }

  public int getSwitchValue() {
    return limitSwitch.getAnalogTriggerTypeForRouting();
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
