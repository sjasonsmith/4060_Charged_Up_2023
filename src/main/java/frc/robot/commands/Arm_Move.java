package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;

import frc.robot.subsystems.Arm;

public class Arm_Move extends CommandBase {

    private final Arm m_arm;
    private double m_destination;

    public Arm_Move(double destination, Arm subsystem) {
        m_destination = destination;
        m_arm = subsystem;
        addRequirements(m_arm);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        // Tell m_arm to move to a new destination. Presumably this will use PID control on the
        // Spark MAX.
    }

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        // There may not be a need to do anything here...
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        // Might have ended early. Tell m_arm to stop moving if it is still in motion.
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
        // Test whether the PID controller has reached it's destination
        return false;
    }

    @Override
    public boolean runsWhenDisabled() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DISABLED
        return false;

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DISABLED
    }
}
