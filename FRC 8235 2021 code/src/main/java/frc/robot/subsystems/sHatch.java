/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;


public class sHatch extends SubsystemBase {

  public static DoubleSolenoid hatchPiston;
  
  
  // @Override 
  // public void setDefaultCommand(Command defaultCommand){
  //   super.setDefaultCommand(new cHatch());
  // }
  
  public sHatch() {
    hatchPiston = new DoubleSolenoid(0,Constants.hatchForwardChannel, Constants.hatchReverseChannel);
  }
    

  public void hatchOpen() {
    hatchPiston.set(kForward);
  }

  public void hatchClosed() {
    hatchPiston.set(kReverse);
  }

  public void stop() {
    hatchPiston.set(kOff);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
