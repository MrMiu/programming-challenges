// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.Subsystem;

public class BoardSubsystem implements Subsystem {
  
  CANSparkMax motor;
  DigitalInput limitSwitch;
  Ultrasonic ultrasonic;


  /** Creates a new ExampleSubsystem. */
  public BoardSubsystem(CANSparkMax motor, DigitalInput limitSwitch, Ultrasonic ultrasonic) {
    this.motor = motor;
    this.limitSwitch = limitSwitch;
    this.ultrasonic = ultrasonic;

    ultrasonic.setAutomaticMode(true);

  }

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
    limitSwitch.get();
  }

  public Ultrasonic getUltrasonic() {
    return ultrasonic;
  }

  public double getUltrasonicValue() {
    return ultrasonic.GetRangeInches();
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
