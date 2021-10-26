/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.sIntake;
//Madhav spx


public class cIntake extends CommandBase {
  
  public static sIntake intakeSubsystem;
  int count;
  
  public cIntake() {
    intakeSubsystem = new sIntake();
    addRequirements(intakeSubsystem);
    count = 0;
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  //@Override
  public void execute() {
    // if (RobotContainer.primaryController.getStartButtonPressed()) {
    //   intakeSubsystem.hatchOpen();
    // }
    // if (RobotContainer.primaryController.getBackButtonPressed()) {
    //   intakeSubsystem.hatchClosed();
    // }
    
    // if (RobotContainer.primaryController.getStartButtonPressed()) {
    //   count1++;
    //   if (count1 % 2 == 1) {
    //     intakeSubsystem.forwardIntake();
    //   }
    //   else {
    //     intakeSubsystem.stopMotor();
    //   }
    // }


    // if (RobotContainer.primaryController.getBackButtonPressed()) {
    //   count2++;
    //   if (count1 % 2 == 1) {
    //     intakeSubsystem.intakeHatchUp();
    //   }
    //   else {
    //     intakeSubsystem.intakeHatchDown();
    //   }
    // }
    intakeSubsystem.intakeHatchDown();

    if (RobotContainer.primaryController.getBackButtonPressed()) {
      count++;
      if (count % 2 == 1) {
        intakeSubsystem.forwardIntake();
      }
      else {
        intakeSubsystem.stop();
      }
    }
    // while (RobotContainer.primaryController.getBackButtonReleased()) {
    //   intakeSubsystem.stopMotor();
    // }
    while (RobotContainer.primaryController.getStartButtonPressed()) {
      intakeSubsystem.reverseIntake();
    }
    while (RobotContainer.primaryController.getStartButtonReleased()) {
      intakeSubsystem.stop();
    }

    while (RobotContainer.primaryController.getYButtonPressed()) {
      intakeSubsystem.intakeHatchUp();
    }
    while (RobotContainer.primaryController.getXButtonPressed()) {
      intakeSubsystem.intakeHatchDown();
    }

  }
    //count++;

  // Called once the command ends or is interrupted.
  //@Override
  public void end(boolean interrupted) {
    
  }
  

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
