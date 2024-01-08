# The Robot Maze

The Robot Maze is an 8 x 8 grid maze. 
The goal is to program the robot to navigate the maze and, exit the maze. 

## Maze Cell

The Maze cell is one of the 64 cells that make up the maze.
Each cell has a bunch of items, and four possible directions, north, south,
east, and west. At each direction there may be either a door, a wall or an exit portal.

# Wall

The robot can not go through a wall.

# Door

The robot can drive through an open door. Doors may be locked,
the robot will have to unlock them with the right key. Some doors 
will have a security camera, the robot can only enter
when the security camera is not active.

# Portal

The Portal or Exit Portal, is the way out of the maze. There is
only one Portal in the maze. For the robot to enter the Portal,
the Portal must be fully generated, this is done with 
portal generators that are found throughout the maze. To be fully
generated, five portal generators will need to be used.

# Items

## Rock

It's a rock.


## Key

The robot can use a key to unlock a door. There are six types of 
keys: Red, Green, Blue, Yellow, Orange, and Purple. Each opens 
a door of the same type.

## Portal Generators

Portal generators are needed to generate the Exit Portal, and 
allow the robot to exit the maze. Five portal generators will be needed.
Each generator must be fully powered with three portal generator power supplies, and then
delivered to the Exit Portal.

## Portal Generator Power Supplies

Portal generator power supplies are needed to power a portal generator.
A generator to be fully powered needs three portal generator power supplies.