package scjp.inheritance.question15;

/**
 * Question 15. The following program fails to compile, where could possibly be 
 *              the compilation error(s)?
 */
class Creature{}
class Bird extends Creature{}
class Falcon extends Bird{}

public class Tester {
    public static void main(String[] args) {
        Creature c1 = new Creature();
        Creature c2 = new Bird();
        
        Bird b1 = (Bird) c1; // Line 1
        Bird b2 = (Falcon) c2; // Line 2
        //Bird b3 = c2; // Line 3
        Bird b4 = new Falcon(); // Line 4
        Bird b5 = (Bird) new Creature(); // Line 5
        //Falcon f1 = b4; // Line 6
    }
}

/**
 * Please choose all the answers that apply:
 * 
 * a) Line 1
 * b) Line 2
 * c) Line 3
 * d) Line 4
 * e) Line 5
 * f) Line 6
 * 
 * R: c and f
 */