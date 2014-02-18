// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc2876.FRC2876AerialAssault.subsystems;

import org.usfirst.frc2876.FRC2876AerialAssault.RobotMap;
import org.usfirst.frc2876.FRC2876AerialAssault.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Arm extends Subsystem {

    private static PIDController armPID;
    private static final double armTop = 10;    //voltage 0.11
    private static final double armBottom = 462;// voltage 2.34;
    private static final double armScore = 338; //voltage 2.025 //scorebottom = 400
    private static final double armKp = 0.50;
    private static final double armKi = 0.00;
    private static final double armKd = 0.00;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController armBaseController = RobotMap.armArmBaseController;
    SpeedController armGrabberController = RobotMap.armArmGrabberController;
    DigitalInput topLimitSwitch = RobotMap.armTopLimitSwitch;
    DigitalInput bottomLimitSwitch = RobotMap.armBottomLimitSwitch;
    DigitalInput ballLimitSwitch = RobotMap.armBallLimitSwitch;
    AnalogChannel armPot = RobotMap.armArmPot;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        setDefaultCommand(new ArmIdle());
    }


    public Arm() {
        initArmPID();
    }

    private class ArmOutput implements PIDOutput {

        public void pidWrite(double output) {

            armBaseController.set(-output);
        }
    }


    private void initArmPID() {

        armPID = new PIDController(armKp, armKi, armKd, armPot, new ArmOutput());
        armPID.setOutputRange(-.8, .8);
        //armPID.setInputRange(armTop, armBottom);
        armPID.setPercentTolerance(5);
        SmartDashboard.putData("armPID", armPID);
    }

    public void stopArmPID() {
        armPID.disable();
        armPID.reset();
    }


    public void raiseArm() {

        armPID.reset();
        armPID.setSetpoint(armTop);
        armPID.enable();
    }

    public void lowerArm() {
        armPID.reset();
        armPID.setSetpoint(armBottom);
        armPID.enable();
    }


//    public void scoreGoalLow() {
//        armPID.reset();
//        armPID.setSetpoint(armScoreBottom);
//        armPID.enable();
//    }
    
    public void scoreGoal() {

        armPID.reset();
        armPID.setSetpoint(armScore);
        armPID.enable();
    }

    public void stopGrabberMotor() {
        armGrabberController.set(0);
    }

    public boolean isBallLimitPressed() {
        return ballLimitSwitch.get();
    }

    public boolean isTopPressed() {
        return topLimitSwitch.get();
    }

    public void armBaseControllerSet(double speed) {
        armBaseController.set(speed);
    }

    public boolean isBottomPressed() {
        return bottomLimitSwitch.get();
    }
    
    public void collectBall() {
        armGrabberController.set(0.8);
        //System.out.println("collectBall");
    }

    public void releaseBall() {
        armGrabberController.set(-0.8);
        //System.out.println("releaseBall");
    }

    public boolean armPIDonTarget(){
        if(Math.abs(armPID.getError()) <= 5){
            return true;
        }else{
            return false;
        }
    }

    public void updateDashboard() {
        SmartDashboard.putData("pot", armPot);
        SmartDashboard.putNumber("armPidInput", armPot.pidGet());
        SmartDashboard.putData("armPID", armPID);
        SmartDashboard.putNumber("error", armPID.getError());
        SmartDashboard.putBoolean("onTarget", armPID.onTarget());
        SmartDashboard.putNumber("armBase", armBaseController.get());
        SmartDashboard.putData("TopLimitSwitch", topLimitSwitch);
        SmartDashboard.putData("BottomLimitSwitch", bottomLimitSwitch);
        SmartDashboard.putData("BallLimitSwitch", ballLimitSwitch);
    }

}
