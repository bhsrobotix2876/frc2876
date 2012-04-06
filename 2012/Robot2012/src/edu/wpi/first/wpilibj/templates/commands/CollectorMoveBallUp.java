/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author user
 */
public class CollectorMoveBallUp extends CommandBase {

    public CollectorMoveBallUp() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(conveyorlow);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        // only try to move a ball up the lower conveyor if there is
        // space to do so.

        //if (conveyorlow.hasBall() && conveyorlow.getCounter() == 1) {
            conveyorlow.forward();
        //}
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return !conveyorlow.hasBall();
    }

    // Called once after isFinished returns true
    protected void end() {
        conveyorlow.idle();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
