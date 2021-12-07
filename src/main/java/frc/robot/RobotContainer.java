// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Ultrasonic;
import frc.robot.commands.BoardCommand;
import frc.robot.subsystems.BoardSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final BoardSubsystem boardSubsystem;

  private final BoardCommand boardCommand;

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    boardSubsystem = new BoardSubsystem(new CANSparkMax(Constants.boardMotorID, MotorType.kBrushless), new DigitalInput(Constants.digitalSwitchPort), new Ultrasonic(Constants.pingChannelPort, Constants.echoChannelPort));
    boardCommand = new BoardCommand(boardSubsystem);
  }

  public Command getBoardCommand() {
    return boardCommand;
  }
}
