package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.Subsystem;

public class BoardSubsystem implements Subsystem {
  
  CANSparkMax motor1;
  CANSparkMax motor2;
  DigitalInput limitSwitch;

  public BoardSubsystem(CANSparkMax motor1, CANSparkMax motor2, DigitalInput limitSwitch) {
    this.motor1 = motor1;
    this.motor2 = motor2;
    this.limitSwitch = limitSwitch;
  }

  public CANSparkMax getMotor1() {
    return motor1;
  }

  public void setMotor1(double val) { 
    motor1.set(val);
  }

  public CANSparkMax getMotor2() {
    return motor2;
  }

  public void setMotor2(double val) { 
    motor2.set(val);
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
