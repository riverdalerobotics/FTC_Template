package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
@TeleOp(group = "Linear OpMode", name = "ExampleOpMode")
public class ExampleOpMode_Linear extends LinearOpMode {
    DcMotor shootMotor;
    @Override
    public void runOpMode() throws InterruptedException {
        shootMotor = hardwareMap.get(DcMotor.class, "ShootMotor");
        waitForStart();
        while(opModeIsActive()){
            shootMotor.setPower(1);
        }
    }
}
