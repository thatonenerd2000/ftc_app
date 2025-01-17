/* Copyright (c) 2017 FIRST. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted (subject to the limitations in the disclaimer below) provided that
 * the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list
 * of conditions and the following disclaimer.
 *
 * Redistributions in binary form must reproduce the above copyright notice, this
 * list of conditions and the following disclaimer in the documentation and/or
 * other materials provided with the distribution.
 *
 * Neither the name of FIRST nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 *
 * NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
 * LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.firstinspires.ftc.team8201;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name="Pushbot: Auto Drive By Time Blue", group="Pushbot")
//@Disabled
public class AutonomousBlueFrontTime extends LinearOpMode {

    HardwareK9bot robot = new HardwareK9bot();   // Use a Pushbot's hardware
    private ElapsedTime     runtime = new ElapsedTime();


    static final double     FORWARD_SPEED = -0.3;
    static final double     TURN_SPEED    = 0.5;

    @Override
    public void runOpMode() {

        /*
         * Initialize the drive system variables.
         * The init() method of the hardware class does all the work here
         */
        robot.init(hardwareMap);

        // Send telemetry message to signify robot waiting;
        telemetry.addData("Status", "Ready to run");    //
        telemetry.update();

        // Wait for the game to start (driver presses PLAY)
        waitForStart();

//        runtime.reset();
//        robot.elevator.setPower(0.5);
//        while (opModeIsActive() && (runtime.seconds() < 1)) {
//            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
//            telemetry.update();
//        }
//
//        runtime.reset();
//        robot.elevator.setPower(0.0);
//        while (opModeIsActive() && (runtime.seconds() < 1)) {
//            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
//            telemetry.update();
//        }

        runtime.reset();
        robot.leftWheelFront.setPower(-FORWARD_SPEED);
        robot.leftWheelBack.setPower(-FORWARD_SPEED);
        robot.rightWheelFront.setPower(-FORWARD_SPEED);
        robot.rightWheelBack.setPower(-FORWARD_SPEED);
        while (opModeIsActive() && (runtime.seconds() < 2.0)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }



        runtime.reset();
        robot.leftWheelFront.setPower(0);
        robot.leftWheelBack.setPower(0);
        robot.rightWheelFront.setPower(0);
        robot.rightWheelBack.setPower(0);
        while (opModeIsActive() && (runtime.seconds() < 2)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        runtime.reset();
        robot.leftWheelFront.setPower(FORWARD_SPEED);
        robot.leftWheelBack.setPower(FORWARD_SPEED);
        robot.rightWheelFront.setPower(FORWARD_SPEED);
        robot.rightWheelBack.setPower(FORWARD_SPEED);
        while (opModeIsActive() && (runtime.seconds() < 0.2)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }

        runtime.reset();
        robot.leftWheelFront.setPower(0);
        robot.leftWheelBack.setPower(0);
        robot.rightWheelFront.setPower(0);
        robot.rightWheelBack.setPower(0);
        while (opModeIsActive() && (runtime.seconds() < 2)) {
            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
            telemetry.update();
        }


//        runtime.reset();
//        robot.leftWheelFront.setPower(-FORWARD_SPEED);
//        robot.leftWheelBack.setPower(-FORWARD_SPEED);
//        robot.rightWheelFront.setPower(-FORWARD_SPEED);
//        robot.rightWheelBack.setPower(-FORWARD_SPEED);
//        while (opModeIsActive() && (runtime.seconds() < 0.3)) {
//            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
//            telemetry.update();
//        }

//
//
//        runtime.reset();
//        // Step 1:  Drive forward for 3 seconds
//        robot.suckInWheelleft.setPower(1);
//        robot.suckInWheelleft.setPower(1);
//        while (opModeIsActive() && (runtime.seconds() < 2)) {
//            telemetry.addData("Path", "Leg 1: %2.5f S Elapsed", runtime.seconds());
//            telemetry.update();
//        }
//
//
//        runtime.reset();
//        robot.leftWheelFront.setPower(-FORWARD_SPEED);
//        robot.leftWheelBack.setPower(-FORWARD_SPEED);
//        robot.rightWheelFront.setPower(-FORWARD_SPEED);
//        robot.rightWheelBack.setPower(-FORWARD_SPEED);
//        while (opModeIsActive() && (runtime.seconds() < 1.5)) {
//            telemetry.addData("Path", "Leg 2: %2.5f S Elapsed", runtime.seconds());
//            telemetry.update();
//        }


        // Step 4:  Stop and close the claw.
        robot.leftWheelFront.setPower(0);
        robot.leftWheelBack.setPower(0);
        robot.rightWheelFront.setPower(0);
        robot.rightWheelBack.setPower(0);

        telemetry.addData("Path", "Complete");
        telemetry.update();
        sleep(1000);
    }
}
