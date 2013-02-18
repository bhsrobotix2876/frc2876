// Generated with RobotBuilder version 0.0.1
package org.usfirst.frc2876.Robot2013;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc2876.Robot2013.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public JoystickButton leftB1;
    public JoystickButton leftB2;
    public JoystickButton leftB3;
    public JoystickButton leftB4;
    public JoystickButton leftB5;
    public JoystickButton leftB6;
    public Joystick leftStick;
    public JoystickButton rightB1;
    public JoystickButton rightB2;
    public JoystickButton rightB3;
    public JoystickButton rightB4;
    public JoystickButton rightB5;
    public JoystickButton rightB6;
    public Joystick rightStick;
    public JoystickButton armB1;
    public JoystickButton armB2;
    public JoystickButton armB3;
    public JoystickButton armB4;
    public JoystickButton armB5;
    public JoystickButton armB6;
    public JoystickButton armB7;
    public JoystickButton armB8;
    public JoystickButton armB9;
    public JoystickButton armB10;
    public JoystickButton armB11;
    public Joystick armStick;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        joystickInit();
        
        SmartDashboard.putData("Shooter Shoot", armB1);
        SmartDashboard.putData("Shooter Idle", armB2);       
        SmartDashboard.putData("Find Targets", armB3);
        SmartDashboard.putData("VisionTurn", armB4);       
        SmartDashboard.putData("VisionIdle", armB5);
        SmartDashboard.putData("TurnRobot", armB6);       
        SmartDashboard.putData("DriveAmount", armB7);

        armB1.whenPressed(new Shoot());
        armB2.whenPressed(new ShootIdle());
        armB3.whenPressed(new AutoTurnShootCG());
        armB4.whenPressed(new DriveForward(24));
        armB5.whenPressed(new DriveForwardStraight(24));
        armB6.whenPressed(new Find2PtTarget());
        armB7.whenPressed(new Find3PtTarget()); 
        armB8.whenPressed(new TurnRobot(90));
        armB9.whenPressed(new TurnRobotVision());
        armB10.whenPressed(new VisionIdle());
        armB11.whenPressed(new AutoAdjustShooter());
    }
    
    public void joystickInit() {
        leftStick = new Joystick(1);
        rightStick = new Joystick(2);
        armStick = new Joystick(3);
        
        armB1 = new JoystickButton(armStick, 1);
        armB2 = new JoystickButton(armStick, 2);
        armB3 = new JoystickButton(armStick, 3);
        armB4 = new JoystickButton(armStick, 4);
        armB5 = new JoystickButton(armStick, 5);
        armB6 = new JoystickButton(armStick, 6);
        
        rightB1 = new JoystickButton(rightStick, 1);
        rightB2 = new JoystickButton(rightStick, 2);
        rightB3 = new JoystickButton(rightStick, 3);
        rightB4 = new JoystickButton(rightStick, 4);
        rightB5 = new JoystickButton(rightStick, 5);
        rightB6 = new JoystickButton(rightStick, 6);
        
        leftB1 = new JoystickButton(leftStick, 1);
        leftB2 = new JoystickButton(leftStick, 2);
        leftB3 = new JoystickButton(leftStick, 3);
        leftB4 = new JoystickButton(leftStick, 4);
        leftB5 = new JoystickButton(leftStick, 5);
        leftB6 = new JoystickButton(leftStick, 6);
    }
    
    // The following variables are automatically assigned by
    // robotbuilder and will be updated the next time you export to
    // Java from robot builder. Do not put any code or make any change
    // in the following block or it will be lost on an update. To
    // prevent this subsystem from being automatically updated, delete
    // the following line.
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getArmStick() {
        return armStick;
    }
    public Joystick getRightStick() {
        return rightStick;
    }
    public Joystick getLeftStick() {
        return leftStick;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
