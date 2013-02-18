/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2876.Robot2013.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2876.Robot2013.Robot;

/**
 *
 * @author Gilad
 */
public class AutoAdjustShooter extends Command {
    
    double volts = 0.0;
    public AutoAdjustShooter() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.shooter);
        volts = Robot.vision.getShooterOff();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.shooter.potInit();
        Robot.shooter.setPotSetpoint(volts);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return Robot.shooter.isFinishedAdjustingShooter();
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.shooter.endShooterPID();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
