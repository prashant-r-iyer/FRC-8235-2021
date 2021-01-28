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
import frc.robot.Constants;

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
    if (RobotContainer.primaryController.getAButtonPressed()){
      String c = panelSubsystem.checkColor();
      panelSubsystem.halfSpeed();;
      if (panelSubsystem.detectColor(c)){
        panelSubsystem.zeroSpeed();
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
