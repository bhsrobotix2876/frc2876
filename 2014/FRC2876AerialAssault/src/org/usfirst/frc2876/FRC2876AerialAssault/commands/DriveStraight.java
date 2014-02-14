/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.usfirst.frc2876.FRC2876AerialAssault.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc2876.FRC2876AerialAssault.Robot;

/**
 *
 * @author maciej
 */
public class DriveStraight extends Command {

    public DriveStraight() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        Robot.driveTrain.driveStraightStart();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // Nothing to do here, the pid controller is making robot drive.
        // SmartDashboard is being updated in teleopPeriodic or autoPeriodic funcs.
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        // This version of drive straight goes on forever until another drive
        // cmd interrupts us.
        
        // Until we get straight line working.. check gyro angle and if it gets
        // too far off give up and stop driving in straight line.
        if (Math.abs(Robot.driveTrain.getHeading()) > 10) {
            return true;
        }
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.driveTrain.driveStraightStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
