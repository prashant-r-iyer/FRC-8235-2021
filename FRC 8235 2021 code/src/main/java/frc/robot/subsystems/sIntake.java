/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class sIntake extends SubsystemBase {

  public static WPI_VictorSPX intakeMotor;
  
  public sIntake() {
    intakeMotor = new WPI_VictorSPX(Constants.intakeMotorPort);
  }

  public void forwardIntake() {
    intakeMotor.set(Constants.forwardIntakeSpeed);
  }

  public void reverseIntake() {
    intakeMotor.set(Constants.reverseIntakeSpeed);
  }

  public void stop() {
    intakeMotor.set(0);
  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

}


