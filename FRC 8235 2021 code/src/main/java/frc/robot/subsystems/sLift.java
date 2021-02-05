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


public class sLift extends SubsystemBase {

  public static WPI_VictorSPX liftMotor1;
  public static WPI_VictorSPX liftMotor2;

  public sLift() {
    liftMotor1 = new WPI_VictorSPX(Constants.liftMotorPort1);
    liftMotor2 = new WPI_VictorSPX(Constants.liftMotorPort2);
  }

  public void liftUp() {
    liftMotor1.set(Constants.liftUpSpeed);
    liftMotor2.set(Constants.liftUpSpeed);
  }


  public void liftDown() {
    liftMotor1.set(-Constants.liftUpSpeed);
    liftMotor2.set(-Constants.liftUpSpeed);
  }

  public void stop() {
    liftMotor1.set(0);
    liftMotor2.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
