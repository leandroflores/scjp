package scjp.inheritance.question01;

/**
 * Question 1. Are the following declarations correct, if you knew that they 
 *             are in the same package?
 */
public class Question01 {
    public static void main(String[] args) {}
}

interface Bouncable{} // Line 1
interface Colorable extends Bouncable{} // Line 2
class Super implements Colorable{} // Line 3
//class Sub implements Colorable extends Super{} // Line 4

/**
 * Please choose only one answer:
 * 
 * a) Yes, the declarations are correct
 * b) No there is a Compilation Error at Line 2, must implements not extends
 * c) No there is a Compilation Error at Line 4, over implementing for 
 *    interface Colorable, Super is already implementing it
 * d) No there is a compilation error at line 4, extends should come before 
 *    implements
 * 
 * R: d
 */
