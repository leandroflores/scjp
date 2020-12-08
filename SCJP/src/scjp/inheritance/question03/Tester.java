package scjp.inheritance.question03;

/**
 * Question 3. Which lines will evaluate to true?
 */
interface Colorable{}
interface Bouncable extends Colorable{}
class Super implements Bouncable{}
class Sub extends Super implements Bouncable{}
public class Tester {
    public static void main(String[] args) {
        System.out.println(new Sub() instanceof Super); // Line 1
        System.out.println(new Sub() instanceof Bouncable); // Line 2
        System.out.println(new Sub() instanceof Colorable); // Line 3
        System.out.println(new Super() instanceof Sub); // Line 4
        System.out.println(new Super() instanceof Colorable); // Line 5
    }
}

/**
 * Please choose only one answer:
 * 
 * a) All lines will evaluate to true
 * b) All lines will evaluate to true and only line 4 will evaluate to false
 * c) Only line 1 and 2 will evaluate to true
 * 
 * R: b
 */