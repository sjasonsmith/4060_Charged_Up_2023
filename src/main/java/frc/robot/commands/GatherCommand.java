package frc.robot.commands;

import frc.robot.subsystems.WristSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class GatherCommand extends Command {

    WristSubsystem m_WristSubsystem;

    public GatherCommand(WristSubsystem wristSubsystem) {
        m_WristSubsystem = wristSubsystem;
        addRequirements(wristSubsystem);
    }   

    @Override
    public void initialize() {
        m_WristSubsystem.deploy();
    }

    @Override
    public void execute() {
        m_WristSubsystem.feedIn();
    }
  
    @Override
    public void end(boolean interrupted) {
        m_WristSubsystem.stopRoller();
        m_WristSubsystem.park();
    }
}
