/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.sDepositor;


public class cDepositor extends CommandBase {

  public static sDepositor depositorSubsystem;
  int count;
  
  public cDepositor() {

    depositorSubsystem = new sDepositor();
    addRequirements(depositorSubsystem);
    count = 0;

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  // Called every time the scheduler runs while the command is scheduled.
  }

  @Override
  public void execute() {
    //int count = 0;
    if (RobotContainer.primaryController.getStickButtonPressed(Hand.kLeft)) {
      count++;
      if (count % 2 == 1) {
        depositorSubsystem.depositForward();
      }
      else {
        depositorSubsystem.stop();
      }
    }
    while (RobotContainer.primaryController.getStickButtonPressed(Hand.kRight)) {
      depositorSubsystem.depositReverse();
    }
    while (RobotContainer.primaryController.getStickButtonReleased(Hand.kRight)) {
      depositorSubsystem.stop();
    }
    //count++;

    
    // if (RobotContainer.primaryController.getStickButtonReleased(Hand.kLeft)) {
    //   depositorSubsystem.stop();
    // }
    // if (RobotContainer.primaryController.getStickButtonReleased(Hand.kRight)) {
    //   depositorSubsystem.stop();
    // }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
