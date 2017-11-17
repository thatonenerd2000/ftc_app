package org.firstinspires.ftc.team8201;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "Test TeleOp", group = "Testing")
public class testBotBasicOp extends LinearOpMode {
    HardwareK9bot robot = new HardwareK9bot();
    
    @Override
    public void runOpMode() {
        
        //Declaring the variables
        
        //motor left
        double leftMotorPower = 0.0;
        
        //motor right
        double RightMotorPower =0.0;
        
        //Initializing the hardware
        robot.init(hardwareMap);
        
        //Testing messages
        telemetry.addData("I am ready 8201 testBot");
        telemetry.update();
        
        //Wait for play
        waitForStart();
        
        //Running everything in the while loop
        while(opModeIsActive()) {
            
            //Defining te the powers of both mototrs according the right_trigger positions
            rightMotorPower = gamepad1.right_trigger;
            leftMotorPower = gamepad1.right_trigger;
            
            if(gamepad1.right_trigger > 0){
                robot.rightMotor.setPower(rightMotorPower);
                rightMotorPower = Range.clip(rightMotorPower, -0.0, 1.0);
                robot.leftMotor.setPower(leftMotorPower);
                leftMotorPower = Range.clip(leftMotorPower, -0.0, 1.0);
            }
        }
    }
}