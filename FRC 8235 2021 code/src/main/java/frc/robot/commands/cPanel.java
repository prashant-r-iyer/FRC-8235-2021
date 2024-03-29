/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.sPanel;

//Madhav SPX
//Madhav SPX
//Madhav SPX
public class cPanel extends CommandBase {

  public static sPanel panelSubsystem;
  
  public cPanel() {
    panelSubsystem = new sPanel();
    addRequirements(panelSubsystem);
  }
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // Main code. First checks the colour to be found. Then, the motor switches on and only turns off when said color is detected.
    // if (RobotContainer.primaryController.getAButtonPressed()) {
    //   char c = panelSubsystem.checkColor();
    //   panelSubsystem.panelSlowSpeed();
    //   if (panelSubsystem.detectColor(c)) {
    //     panelSubsystem.panelNormalSpeed();
    //   }
    // }
    // while (RobotContainer.primaryController.getAButtonPressed()) {
    //   panelSubsystem.panelHatchUp();
    //   panelSubsystem.panelSlowSpeed();
    //   if (panelSubsystem.detectColor("G")) {
    //     panelSubsystem.panelHatchDown();
    //  }
    // }
    

    // if (RobotContainer.primaryController.getBButtonPressed()) {
    //   panelSubsystem.panelHatchUp();
    //   panelSubsystem.panelSlowSpeed();
    //   if (panelSubsystem.detectColor("R")) {
    //   panelSubsystem.panelHatchDown();
    //    }
    // }
   
    // if (RobotContainer.primaryController.getXButtonPressed()) {
    //   panelSubsystem.panelHatchUp();
    //   panelSubsystem.panelSlowSpeed();
    //   if (panelSubsystem.detectColor("B")) {
    //   panelSubsystem.panelHatchDown();
    //   }
    // }

    // if (RobotContainer.primaryController.getYButtonPressed()) {
    //   panelSubsystem.panelHatchUp();
    //   panelSubsystem.panelSlowSpeed();
    //   if (panelSubsystem.detectColor("Y")) {
    //   panelSubsystem.panelHatchDown();
    //   }
    // }
  
    if (RobotContainer.primaryController.getAButtonPressed()) {
      panelSubsystem.panelHatchUp();
      panelSubsystem.panelNormalSpeed();
    }
    while (RobotContainer.primaryController.getBButtonPressed()) {
      panelSubsystem.panelHatchDown();
    }
    while (RobotContainer.primaryController.getAButtonReleased()) {
      panelSubsystem.stop();
    }
    // while (RobotContainer.primaryController.getAButtonReleased() || RobotContainer.primaryController.getBButtonReleased()) {
    //   panelSubsystem.stop();
    // }

    //panelSubsystem.stop();
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
