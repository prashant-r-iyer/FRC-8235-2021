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


public class sDepositor extends SubsystemBase {
  public static WPI_VictorSPX depositorMotor1;
  public static WPI_VictorSPX depositorMotor2;

  public sDepositor() {

  depositorMotor1 = new WPI_VictorSPX(Constants.depositorMotorPort1);
  depositorMotor2 = new WPI_VictorSPX(Constants.depositorMotorPort2);

  }

  public void depositForward() {

    depositorMotor1.set(-Constants.depositorForwardSpeed);
    depositorMotor2.set(Constants.depositorForwardSpeed);

  }

  public void depositReverse() {
    depositorMotor1.set(Constants.depositorReverseSpeed);
    depositorMotor2.set(-Constants.depositorReverseSpeed);
  }


  public void stop() {

    depositorMotor1.set(0);
    depositorMotor2.set(0);
    
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
