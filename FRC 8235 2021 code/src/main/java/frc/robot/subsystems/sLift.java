/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class sTeleLift extends SubsystemBase {

  public static WPI_VictorSPX teleLiftMotor1;
  public static WPI_VictorSPX teleLiftMotor2;

  public sTeleLift() {
    teleLiftMotor1 = new WPI_VictorSPX(Constants.teleLiftMotorPort1);
    teleLiftMotor2 = new WPI_VictorSPX(Constants.teleLiftMotorPort2);
  }

  public void upMotor1() {
    teleLiftMotor1.set(Constants.teleLiftUpSpeed);
  }

  public void downMotor1() {
    teleLiftMotor1.set(Constants.teleLiftDownSpeed);
  }

  public void upMotor2() {
    teleLiftMotor2.set(Constants.teleLiftUpSpeed);
  }

  public void downMotor2() {
    teleLiftMotor1.set(Constants.teleLiftDownSpeed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
