package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.subsystems.sDrive;


public class cDrive extends CommandBase {

  public static double straightSpeed;
  public static double turnFactor;
  public static sDrive driveSubsystem;

  public cDrive() {
    driveSubsystem = new sDrive();
    addRequirements(driveSubsystem);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    straightSpeed = Constants.straightSpeedMultiple * RobotContainer.primaryController.getY(Hand.kLeft);
    turnFactor = Constants.turnFactorMultiple * RobotContainer.primaryController.getX(Hand.kRight);

    driveSubsystem.manualDrive(straightSpeed, turnFactor);
  }

  @Override
  public void end(boolean interrupted) {
    if (interrupted) {
      straightSpeed = 0;
    }
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
