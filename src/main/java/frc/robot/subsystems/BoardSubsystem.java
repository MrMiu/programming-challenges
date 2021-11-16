// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj2.command.Subsystem;

public class BoardSubsystem implements Subsystem {
  
  CANSparkMax motor;

  /** Creates a new ExampleSubsystem. */
  public BoardSubsystem(CANSparkMax motor) {
    this.motor = motor;
  }

  public CANSparkMax getMotor() {
    return motor;
  }

  public void setMotor(double val) { 
    motor.set(val);
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
