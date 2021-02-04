/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

//Madhav spx


public class sIntake extends SubsystemBase {

  public static WPI_VictorSPX intakeMotor;
  public static DoubleSolenoid intakePiston;
  
  public sIntake() {
    intakePiston = new DoubleSolenoid(0,Constants.intakeForwardChannel, Constants.intakeReverseChannel);
    intakeMotor = new WPI_VictorSPX(Constants.intakeMotorPort);
  }
  
  //Madhav spx

  public void forwardIntake() {
    intakeMotor.set(Constants.intakeForwardSpeed);
  }

  public void reverseIntake() {
    intakeMotor.set(Constants.intakeBackwardSpeed);
  }

  public void hatchOpen() {
    intakePiston.set(kForward);
  }

  public void hatchClosed() {
    intakePiston.set(kReverse);
  }

  public void stop() {
    intakeMotor.set(0);
    intakePiston.set(kOff);
  }
  
  //Madhav spx
  
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}

//Madhav spx
