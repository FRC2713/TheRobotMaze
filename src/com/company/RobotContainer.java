package com.company;

import com.company.commands.Example;
import com.company.foundation.Item.*;
import com.company.foundation.Robot.*;
import com.company.foundation.Robot.RobotBase.*;
import com.company.subsystems.Camera;
import com.company.subsystems.Drivetrain;
import com.company.subsystems.Grabber;
import com.company.subsystems.RangeFinder;

import java.util.ArrayList;

public class RobotContainer {

    public RobotContainer(Robot robot) {

        //initialize subsystems
        //uses subsystems as is, do not edit or create your own
        Camera camera = Camera.getInstance(robot);
        Drivetrain drivetrain = Drivetrain.getInstance(robot);
        Grabber grabber = Grabber.getInstance(robot);
        RangeFinder rangeFinder = RangeFinder.getInstance(robot);

        robot.setDelay(1); //delay output, so it can be more easily read

        //Example code, can be removed

        //Array List
        //ArrayList<type> array = new ArrayList<>();
        ArrayList<Direction> arrayOfDirections = new ArrayList<>();
        arrayOfDirections.add(Direction.North); //Direction is an enum
        arrayOfDirections.add(Direction.East);

        //for each loop
        for (Direction direction : arrayOfDirections) {
            System.out.println(direction.toString());
        }

        arrayOfDirections.clear(); //remove all elements of the ArrayList

        arrayOfDirections.add(Direction.values()[0]);
        arrayOfDirections.add(Direction.values()[2]);

        //() -> is a lambda
        //(args) -> code
        arrayOfDirections.forEach((direction) -> System.out.println(direction.toString()));
        //:: is a shortcut for a lambda
        arrayOfDirections.forEach(System.out::println);

        //can not use int must use Integer
        ArrayList<Integer> arrayOfInts = new ArrayList<>();

        arrayOfInts.add(1);
        arrayOfInts.add(Direction.North.ordinal());

        arrayOfInts.forEach(System.out::println);


        System.exit(0); //remove this

        //Robot code

        robot.launchCommand(new Example());

        robot.launchCommand(new WhenCommand(() -> true,
                new MiniCommand(() -> System.out.println("This will repeat."))));

        robot.launchCommand(new WhenCommand(() -> true,
                new RunOnceMiniCommand(() -> System.out.println("This will run once."))));

        robot.launchCommand(new SequentialCommandGroup(
                new RunOnceMiniCommand(() -> System.out.println("1A")),
                new RunOnceMiniCommand(() -> System.out.println("2A")),
                new RunOnceMiniCommand(() -> System.out.println("3A"))
        ));

        robot.launchCommand(new ParallelCommandGroup(
                new RunOnceMiniCommand(() -> System.out.println("1B")),
                new RunOnceMiniCommand(() -> System.out.println("2B")),
                new RunOnceMiniCommand(() -> System.out.println("3B"))
        ));

        //End of Example code

        //Make your own commands.
        //Use Subsystems, and your commands to program the robot, to exit the maze.

        //Other than robot.launchCommand, robot.setDelay, the methods of your own command classes,
        //and the methods of the Subsystems, the only other methods you should call are the
        //analyze() method of the Item class, and the analyzeKey() method of the Key class.

        //Also, the robot will manage all ArrayLists internally, you should not add or remove
        //elements from an ArrayList the robot will do this for you.
        //You can use the forEach method on an ArrayList.

        //You can of course use Java standard library methods such as System.out.println().

    }
}
