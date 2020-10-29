package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.Robot;
import frc.robot.RobotContainer;

public class cDrive extends CommandBase {

  double straightSpeed;
  double turnFactor;
  double straightSpeedLeft;
  double straightSpeedRight;

  public cDrive() {
    addRequirements(Robot.driveSubsystem);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    straightSpeed = Constants.straightSpeedMultiple * ((GenericHID) RobotContainer.primaryController).getY(Hand.kLeft);
    turnFactor = Constants.turnFactorMultiple * ((GenericHID) RobotContainer.primaryController).getX(Hand.kRight);

    Robot.driveSubsystem.manualDrive(straightSpeed, turnFactor);
  }

  @Override
  public void end(boolean interrupted) {
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
