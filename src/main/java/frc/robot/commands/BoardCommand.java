package frc.robot.commands;

import frc.robot.subsystems.BoardSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class BoardCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final BoardSubsystem boardSubsystem;

  public BoardCommand(BoardSubsystem boardSubsystem) {
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
    // This portion will never have an error
    if (boardSubsystem.getSwitchValue()) {
      boardSubsystem.setMotor(0);
      SmartDashboard.putBoolean("Win", true);  
    }
    // This might though
    SmartDashboard.putNumber("Ultrasonic: ", boardSubsystem.getUltrasonicValue()); 
    boardSubsystem.setMotor(0.5);
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
