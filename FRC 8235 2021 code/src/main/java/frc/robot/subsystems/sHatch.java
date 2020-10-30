package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.cHatch;

public class sHatch extends SubsystemBase {

  public static DoubleSolenoid hatchPiston;
  
  @Override
  public void setDefaultCommand(Command defaultCommand) {
    super.setDefaultCommand(new cHatch());
  }
  
  public sHatch() {
    hatchPiston = new DoubleSolenoid(Constants.forwardChannel,Constants.reverseChannel);
  }
  
  public void hatchOpen() {
    hatchPiston.set(DoubleSolenoid.Value.kForward);
  }

  public void hatchClosed() {
    hatchPiston.set(DoubleSolenoid.Value.kReverse);
  }

  public void hatchNot() {
    hatchPiston.set(DoubleSolenoid.Value.kOff);
  }

  @Override
  public void periodic() {
  } 
}
