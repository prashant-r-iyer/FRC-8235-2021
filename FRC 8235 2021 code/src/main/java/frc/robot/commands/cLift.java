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
import frc.robot.subsystems.sLift;


public class cLift extends CommandBase {

  public static sLift liftSubsystem;
  int count1;
  int count2;
  
  public cLift() {
    liftSubsystem = new sLift();
    addRequirements(liftSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    if (RobotContainer.primaryController.getBumperPressed(Hand.kLeft)){
      count1++;
      if (count1 % 2 == 1) {
        liftSubsystem.liftUp();
      }
      else {
        liftSubsystem.stop();
      }
    }
    while (RobotContainer.primaryController.getBumperPressed(Hand.kRight)){
      count2++;
      if (count2 % 2 == 1) {
        liftSubsystem.liftDown();
      }
      else {
        liftSubsystem.stop();
      }
    }
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
