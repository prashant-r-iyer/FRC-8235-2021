package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.cDrive;

public class sDrive extends SubsystemBase {

  public static WPI_VictorSPX leftFrontMotor;
  public static WPI_VictorSPX rightFrontMotor;
  public static WPI_VictorSPX leftBackMotor;
  public static WPI_VictorSPX rightBackMotor;
  
  public static SpeedControllerGroup leftMotorGroup;
  public static SpeedControllerGroup rightMotorGroup;
  
  public static DifferentialDrive drive;

  @Override
  public void setDefaultCommand(Command defaultCommand) {
    super.setDefaultCommand(new cDrive());
  }

  public sDrive() {
    leftFrontMotor = new WPI_VictorSPX(Constants.leftFrontMotorPort);
    rightFrontMotor = new WPI_VictorSPX(Constants.rightFrontMotorPort);
    leftBackMotor = new WPI_VictorSPX(Constants.leftBackMotorPort);
    rightBackMotor = new WPI_VictorSPX(Constants.rightBackMotorPort);
    
    leftMotorGroup = new SpeedControllerGroup(leftBackMotor, leftFrontMotor);
    rightMotorGroup = new SpeedControllerGroup(rightBackMotor, rightFrontMotor);
    
    drive = new DifferentialDrive(leftMotorGroup, rightMotorGroup);
    
    /* leftFrontMotor.configFactoryDefault();
    rightFrontMotor.configFactoryDefault();
    leftBackMotor.configFactoryDefault();
    rightBackMotor.configFactoryDefault(); */
    
    leftFrontMotor.setInverted(false);
    rightFrontMotor.setInverted(false);
    leftBackMotor.setInverted(false);
    rightBackMotor.setInverted(false);
  }

  public void manualDrive(double speed, double rotation) {
    drive.arcadeDrive(speed, rotation);
  }

  public void slowFront() {
    leftFrontMotor.set(Constants.slowSpeed);
    rightFrontMotor.set(-Constants.slowSpeed);
    leftBackMotor.set(Constants.slowSpeed);
    rightBackMotor.set(-Constants.slowSpeed);
  }

  public void slowLeft() {
    leftFrontMotor.set(-Constants.slowSpeed);
    rightFrontMotor.set(Constants.slowSpeed);
    leftBackMotor.set(-Constants.slowSpeed);
    rightBackMotor.set(Constants.slowSpeed);
  }

  public void slowRight() {
    leftFrontMotor.set(Constants.slowSpeed);
    rightFrontMotor.set(-Constants.slowSpeed);
    leftBackMotor.set(Constants.slowSpeed);
    rightBackMotor.set(-Constants.slowSpeed);
  }

  public void driveNot() {
    leftFrontMotor.set(0);
    rightFrontMotor.set(0);
    leftBackMotor.set(0);
    rightBackMotor.set(0);
  }

  @Override
  public void periodic() {
  }
}
