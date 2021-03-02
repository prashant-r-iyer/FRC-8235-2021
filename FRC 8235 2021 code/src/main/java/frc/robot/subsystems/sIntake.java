/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

//Madhav spx


public class sIntake extends SubsystemBase {

  public static WPI_VictorSPX intakeMotor1;
  public static WPI_VictorSPX intakeMotor2;
  public static DoubleSolenoid intakePiston;
  
  public sIntake() {
    intakePiston = new DoubleSolenoid(0,Constants.intakeForwardChannel, Constants.intakeReverseChannel);
    intakeMotor1 = new WPI_VictorSPX(Constants.intakeMotorPort2);
    intakeMotor2 = new WPI_VictorSPX(Constants.intakeMotorPort2);
  }
  
  //Madhav spx

  public void forwardIntake() {
    intakeMotor1.set(Constants.intakeForwardSpeed);
    intakeMotor2.set(Constants.intakeForwardSpeed);
  }

  public void reverseIntake() {
    intakeMotor1.set(Constants.intakeBackwardSpeed);
    intakeMotor2.set(Constants.intakeForwardSpeed);
  }

  public void intakeHatchUp() {
    intakePiston.set(Value.kForward);
  }

  public void intakeHatchDown() {
    intakePiston.set(Value.kReverse);
  }

  public void stop() {
    intakeMotor1.set(0);
    intakeMotor2.set(0);
    intakePiston.set(Value.kOff);
    //intakePiston.set(Value.kOff);
  }

  
  //Madhav spx
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

//Madhav spx
