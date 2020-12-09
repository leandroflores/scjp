package scjp.enums.question06;

/**
 * Question 6. Which code, inserted at line 14, allows the Sprite class 
 *             to compile?
 */
class Nav {
    public enum Direction { NORTH, SOUTH, EAST, WEST }
}
public class Sprite {
    // insert code here
}

/**
 * Please choose only one answer:
 * 
 * a) Direction d = NORTH;
 * b) Nav.Direction d = NORTH;
 * c) Direction d = Direction.NORTH;
 * d) Nav.Direction d = Nav.Direction.NORTH;
 * 
 * R: d
 */