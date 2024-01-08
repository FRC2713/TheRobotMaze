package com.company.commands;

import com.company.foundation.Pathway.*;
import com.company.foundation.Robot.CommandBase;
import com.company.foundation.Robot.RobotBase.*;
import com.company.subsystems.Camera;
import com.company.subsystems.Drivetrain;


public class Example extends CommandBase {

    Drivetrain drivetrain = Drivetrain.getInstance();

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        drivetrain.drive(Direction.East);
    }

    @Override
    public void end() {
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
