/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

<<<<<<< HEAD
import edu.wpi.first.wpilibj.GenericHID.Hand;
=======
>>>>>>> 02537aaec99f2b553642b350a88c57b4650143f9
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.RobotContainer;
import frc.robot.subsystems.sLift;

<<<<<<< HEAD
public class cLift extends CommandBase {
  
  public static sLift liftSubsystem;
  public cLift() {
    liftSubsystem = new sLift();
    addRequirements(liftSubsystem);
=======
import edu.wpi.first.wpilibj2.command.CommandBase;

public class cLift extends CommandBase {
  /**
   * Creates a new cLift.
   */
  public cLift() {
>>>>>>> 02537aaec99f2b553642b350a88c57b4650143f9
    // Use addRequirements() here to declare subsystem dependencies.
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
<<<<<<< HEAD
    while (RobotContainer.primaryController.getBumperPressed(Hand.kLeft)){
    liftSubsystem.liftDown();
    }
    while (RobotContainer.primaryController.getBumperPressed(Hand.kLeft)){
      liftSubsystem.liftUp();
    }
=======
>>>>>>> 02537aaec99f2b553642b350a88c57b4650143f9
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
