/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    public static int primaryControllerPort = 0;
    public static int secondaryControllerPort = 1;

    public static double turnFactorMultiple = 0.7;
    public static double straightSpeedMultiple = 0.8;
    //public static double turnFactorMultiple = 0;
    //public static double straightSpeedMultiple = 0;

    public static int leftFrontMotorPort = 4;
    public static int rightFrontMotorPort = 1;
    public static int leftBackMotorPort = 2;
    public static int rightBackMotorPort = 3;
    public static double slowSpeed = 0.3;
    public static double testSpeed = 0.5;
    
    public static int hatchForwardChannel = 4;
    public static int hatchReverseChannel = 5;

    public static int intakeMotorPort = 0;
    public static double intakeForwardSpeed = 1;
    public static double intakeBackwardSpeed = -1;
    public static int intakeForwardChannel = 6;
    public static int intakeReverseChannel = 7;

    public static int liftMotorPort1 = 2;
    public static int liftMotorPort2 = 3;
    public static int liftUpSpeed = 1;
}
