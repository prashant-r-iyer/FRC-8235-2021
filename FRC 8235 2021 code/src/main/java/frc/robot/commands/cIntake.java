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
import frc.robot.subsystems.sIntake;

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
    intakeSubsystem.hatchOpen();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (RobotContainer.primaryController.getBumperPressed(Hand.kLeft)) {
      intakeSubsystem.reverseIntake();
    }
    if (RobotContainer.primaryController.getBumperPressed(Hand.kRight)) {
      intakeSubsystem.forwardIntake();
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    intakeSubsystem.hatchClosed();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
