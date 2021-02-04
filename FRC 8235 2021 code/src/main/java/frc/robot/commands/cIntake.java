/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.subsystems.sIntake;
//Madhav spx


public class cIntake extends CommandBase {
  
  public static sIntake intakeSubsystem;
  
  public cIntake() {
    intakeSubsystem = new sIntake();
    addRequirements(intakeSubsystem);
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }
  //Madhav spx

  // Called every time the scheduler runs while the command is scheduled.
  //@Override
  public void execute() {
    // if (RobotContainer.primaryController.getXButtonPressed()) {
    //   intakeSubsystem.hatchOpen();
    // }
    // if (RobotContainer.primaryController.getBButtonPressed()) {
    //   intakeSubsystem.hatchClosed();
    // }
    int count = 0;
    if (RobotContainer.primaryController.getXButtonPressed()) {
      count++;
      if (count % 2 == 1) {
        intakeSubsystem.forwardIntake();
      }
      else {
        intakeSubsystem.stop();
      }
    }

//Madhav spx
    
    while (RobotContainer.primaryController.getBButtonPressed()) {
      intakeSubsystem.reverseIntake();
    }
    if (RobotContainer.primaryController.getBButtonReleased()) {
      intakeSubsystem.stop();
    }
  }
//Fat motor = new Madhavspx(fatport)
  // Called once the command ends or is interrupted.
  //@Override
  public void end(boolean interrupted) {
    intakeSubsystem.hatchClosed();
  }
  
  //Madhav spx

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
//Madhav spx