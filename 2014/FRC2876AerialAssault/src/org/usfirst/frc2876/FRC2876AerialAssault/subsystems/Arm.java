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
/**
 *
 */
public class Arm extends Subsystem {
    private double armMax;
    private double armMin;
    
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
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void raiseArm(){
        
    }
    
    public void lowerArm(){
        
    }
    
}