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

    public static int leftFrontMotorPort = 8;
    public static int rightFrontMotorPort = 5;
    public static int leftBackMotorPort = 7;
    public static int rightBackMotorPort = 6;
    public static double slowSpeed = 0.5;
    public static double testSpeed = 0.1;

    public static int intakeMotorPort1 = 1;
    public static int intakeMotorPort2 = 3;
    public static double intakeSpeed = 0.5;
    public static int intakeForwardChannel = 5;
    public static int intakeReverseChannel = 4;

    public static int depositorMotorPort1 = 4;
    public static int depositorMotorPort2 = 2;
    public static double depositorForwardSpeed = 0.95;
    public static double depositorReverseSpeed = 0.3;

    public static int liftMotorPort1 = 10;
    public static int liftMotorPort2 = 11;
    public static double liftUpSpeed = 0.9;

    public static int panelMotorPort = 9;
    public static double slowPanelSpeed = 0.5;
    public static double normalPanelSpeed = 1;
    public static int panelForwardChannel = 7;
    public static int panelReverseChannel = 6;
}
