package frc.robot.commands;

import frc.robot.Constants;
import frc.robot.subsystems.BoardSubsystem;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class BoardCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final BoardSubsystem boardSubsystem;
  Joystick joy;

  public BoardCommand(BoardSubsystem boardSubsystem, Joystick joy) {
    this.joy = joy;
    this.boardSubsystem = boardSubsystem;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(boardSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    SmartDashboard.putBoolean("Limit Switch", boardSubsystem.getSwitchValue());
    SmartDashboard.putNumber("Motor Speed", boardSubsystem.getMotor1().get());

    if (joy.getRawButton(Constants.joyA)) {
      boardSubsystem.setMotor1(0.3);
    } else{
      boardSubsystem.setMotor1(0);
    }

    if (joy.getRawButton(Constants.joyB)) {
      boardSubsystem.setMotor2(0.3);
    } else{
      boardSubsystem.setMotor2(0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end (boolean interrupted) {

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
