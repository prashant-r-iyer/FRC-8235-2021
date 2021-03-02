/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.commands.cDepositor;
import frc.robot.commands.cDrive;
import frc.robot.commands.cIntake;
import frc.robot.commands.cLift;
import frc.robot.commands.cPanel;


/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
public class Robot extends TimedRobot {

  //private Command m_autonomousCommand;
  public static cDrive driveCommand = new cDrive();
  public static cIntake intakeCommand = new cIntake();
  public static cDepositor depositorCommand = new cDepositor();
  public static cLift liftCommand = new cLift();
  public static cPanel panelCommand = new cPanel();

  public double startTime;
  public double currentTime;


  /**
   * This function is run when the robot is first started up and should be used for any
   * initialization code.
   */
  @Override
  public void robotInit() {
    // Instantiate our RobotContainer.  This will perform all our button bindings, and put our
    // autonomous chooser on the dashboard.
    // robotContainer = new RobotContainer();
  }

  /**
   * This function is called every robot packet, no matter the mode. Use this for items like
   * diagnostics that you want ran during disabled, autonomous, teleoperated and test.
   *
   * <p>This runs after the mode specific periodic functions, but before
   * LiveWindow and SmartDashboard integrated updating.
   */
  @Override
  public void robotPeriodic() {
    // Runs the Scheduler.  This is responsible for polling buttons, adding newly-scheduled
    // commands, running already-scheduled commands, removing finished or interrupted commands,
    // and running subsystem periodic() methods.  This must be called from the robot's periodic
    // block in order for anything in the Command-based framework to work.
    CommandScheduler.getInstance().run();
  }

  /**
   * This function is called once each time the robot enters Disabled mode.
   */
  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
  }

  /**
   * This autonomous runs the autonomous command selected by your {@link RobotContainer} class.
   */
  @Override
  public void autonomousInit() {
    //m_autonomousCommand = m_robotContainer.getAutonomousCommand();

    // schedule the autonomous command (example)
    //if (m_autonomousCommand != null) {
      //m_autonomousCommand.schedule();
      startTime = Timer.getFPGATimestamp();
    }
  //}

  /**
   * This function is called periodically during autonomous.
   */
  @Override
  public void autonomousPeriodic() {
    currentTime = Timer.getFPGATimestamp();
    if (currentTime - startTime > 0) {
      cDrive.driveSubsystem.slowFront();
      cIntake.intakeSubsystem.forwardIntake();
      cIntake.intakeSubsystem.intakeHatchDown();
    }
    if (currentTime - startTime > 10) {
      cDrive.driveSubsystem.stop();
      //Turn right
    }
    if (currentTime - startTime > 20) {
      cIntake.intakeSubsystem.stop();
      //Turn around
      //Color panel
    }
    if (currentTime - startTime > 40) {
      cIntake.intakeSubsystem.stop();
      //Turn around
      cDrive.driveSubsystem.slowReverse();
    }
    if (currentTime - startTime > 50) {
      cDrive.driveSubsystem.stop();
      cDepositor.depositorSubsystem.depositForward();
    }
    if (currentTime - startTime > 55) {
      cDepositor.depositorSubsystem.stop();
      //Drive to pole
    }
    if (currentTime - startTime > 65) {
      cDrive.driveSubsystem.stop();
      cLift.liftSubsystem.liftUp();
    }
    if (currentTime - startTime > 90) {
      cLift.liftSubsystem.stop();
    }
  }

  @Override
  public void teleopInit() {
    // This makes sure that the autonomous stops running when
    // teleop starts running. If you want the autonomous to
    // continue until interrupted by another command, remove
    // this line or comment it out.
    //if (m_autonomousCommand != null) {
      //m_autonomousCommand.cancel();
    }
  //}

  /**
   * This function is called periodically during operator control.
   */
  @Override
  public void teleopPeriodic() {
    //intakeCommand.initialize();
    driveCommand.execute();
    intakeCommand.execute();
    depositorCommand.execute();
    liftCommand.execute();
    depositorCommand.execute();
    panelCommand.execute();
  }

  @Override
  public void testInit() {
    cDrive.straightSpeed = Constants.testSpeed;
    // Cancels all running commands at the start of test mode.
    CommandScheduler.getInstance().cancelAll();
  }

  /**
   * This function is called periodically during test mode.
   */
  @Override
  public void testPeriodic() {
  }
}
