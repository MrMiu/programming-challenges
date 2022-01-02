package frc.robot.autonomous;

import frc.robot.subsystems.BoardSubsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;

public class AutoBoardCommand extends CommandBase {

  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final BoardSubsystem boardSubsystem;
  private double speed;
  private boolean shouldRun;

  public AutoBoardCommand(BoardSubsystem boardSubsystem, double speed, boolean shouldRun) {
    this.boardSubsystem = boardSubsystem;
    this.speed = speed;
    this.shouldRun = shouldRun;
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
    SmartDashboard.putNumber("Motor Speed", boardSubsystem.getMotor().get());
    // The if statement might have an error
    if (shouldRun) {
      //But this part (the body of the if statement) will not :)
      boardSubsystem.setMotor(speed);
    } else {
      boardSubsystem.setMotor(0);
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
