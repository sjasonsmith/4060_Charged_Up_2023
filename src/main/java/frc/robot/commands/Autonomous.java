package frc.robot.commands;

import edu.wpi.first.wpilibj.Preferences;


public class Autonomous {

    public static double BackUpScalar = 1.0;
    public static double DriveOutScalar = 1.0;
    public static double ChargeScalar = 1.0;
    public static double CrossToChargeScalar = 1.0;

    Preferences prefs;

    public void robotinit(){

        BackUpScalar = prefs.getDouble("BackUp Scalar", 1.0);
        DriveOutScalar = prefs.getDouble("Driveout Scalar", 1.0);
        ChargeScalar = prefs.getDouble("Charge Scalar", 1.0);
        CrossToChargeScalar = prefs.getDouble("Cross To Charge Scalar", 1.0);
    }
}

  