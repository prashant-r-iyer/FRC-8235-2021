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
  int count1;
  int count2;
  
  public cIntake() {
    intakeSubsystem = new sIntake();
    addRequirements(intakeSubsystem);
    count1 = 0;
    count2 = 0;
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
    // if (RobotContainer.primaryController.getStartButtonPressed()) {
    //   intakeSubsystem.hatchOpen();
    // }
    // if (RobotContainer.primaryController.getBackButtonPressed()) {
    //   intakeSubsystem.hatchClosed();
    // }
    
    if (RobotContainer.primaryController.getStartButtonPressed()) {
      count1++;
      if (count1 % 2 == 1) {
        intakeSubsystem.forwardIntake();
      }
      else {
        intakeSubsystem.stopMotor();
      }
    }

//Madhav spx

    if (RobotContainer.primaryController.getBackButtonPressed()) {
      count2++;
      if (count1 % 2 == 1) {
        intakeSubsystem.intakeHatchUp();
      }
      else {
        //intakeSubsystem.stopHatch();
      }
    }
    
    // while (RobotContainer.primaryController.getBackButtonPressed()) {
    //   //intakeSubsystem.reverseIntake();
    //   intakeSubsystem.intakeHatchUp();
    // }
    // while (RobotContainer.primaryController.getBackButtonReleased()) {
    //   intakeSubsystem.stop();
    }
    //count++;
  
//Fat motor = new Madhavspx(fatport);
  // Called once the command ends or is interrupted.
  //@Override
  public void end(boolean interrupted) {
    
  }
  
  //Madhav spx

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
//Madhav spx