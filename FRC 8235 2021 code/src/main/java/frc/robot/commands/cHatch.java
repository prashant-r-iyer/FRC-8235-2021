package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotContainer;

public class cHatch extends CommandBase {
  
  public cHatch() {
    addRequirements(Robot.hatchSubsystem);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    while (RobotContainer.primaryController.getYButtonPressed() == true) {
      Robot.hatchSubsystem.hatchOpen();
    }
    while (RobotContainer.primaryController.getAButtonPressed() == true) {
      Robot.hatchSubsystem.hatchClosed();
    }
    while (RobotContainer.primaryController.getYButtonReleased() == true) {
      Robot.hatchSubsystem.hatchNot();
    }
    while (RobotContainer.primaryController.getAButtonReleased() == true) {
      Robot.hatchSubsystem.hatchNot();
    }
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}